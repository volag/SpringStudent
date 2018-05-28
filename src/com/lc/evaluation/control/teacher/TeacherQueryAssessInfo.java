package com.lc.evaluation.control.teacher;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzStudentDto;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.service.impl.StudentServiceImpl;
import com.lc.evaluation.service.impl.TeacherServiceImpl;

@Controller
@RequestMapping("/teacher/service")
@SessionAttributes({UserType.userType, "assessCourses", "assessClazz"})
public class TeacherQueryAssessInfo {
	
	Logger log = LogManager.getLogger(TeacherQueryAssessInfo.class);
	
	@Autowired
	TeacherServiceImpl service;
	
	@RequestMapping("/assessCourses")
	public String queryAssessCourse(
			@ModelAttribute(UserType.userType) Teacher teacher,
			Model model
			){
		log.info("----------------------------");
		model.addAttribute("assessCourses",
				service.queryAssessGroupByCourseClazz(teacher.getId()));
		System.out.println("teacher : " + service.queryAssessGroupByCourseClazz(teacher.getId()).size());
		return "teacher/assessCourses";
	}
	
	@RequestMapping("/assessClazz")
	public String queryAssessClazz(
			@ModelAttribute(UserType.userType) Teacher teacher,
			@ModelAttribute("courseId") Integer courseId,
			@ModelAttribute("clazzId") String clazzId,
			Model model
			){
		
		log.info("queryAssessClazz : " + service.queryAssessGroupByCourseClazzStudent(
				teacher.getId(), courseId, clazzId).size());
		model.addAttribute("assessClazz",
				service.queryAssessGroupByCourseClazzStudent(
						teacher.getId(), courseId, clazzId));
		
		return "teacher/assessClazz";
	}
	
	@Autowired
	StudentServiceImpl studentService;
	
	@RequestMapping("/assessStudentInfo")
	public String assessInfo(
			@RequestParam("coreId") Integer assessId,
			Model model) {
		
		List<QuestionAndAnswerRespDto> listQ = 
				studentService.queryQuestionAndAnswer(assessId);
		model.addAttribute("questions", listQ);
		
		model.addAttribute("advice",
				studentService.queryAssessAdvice(assessId));
		
		return "teacher/assessStudentInfo";
		
	}

}
