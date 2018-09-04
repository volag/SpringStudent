package com.lc.evaluation.control.teacher;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
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
		model.addAttribute("assessCourses",
				service.queryAssessGroupByCourseClazz(teacher.getId()));
		return "teacher/assessCourses";
	}
	
	@RequestMapping("/assessClazz")
	public String queryAssessClazz(
			@ModelAttribute(UserType.userType) Teacher teacher,
			@ModelAttribute("courseId") Integer courseId,
			@ModelAttribute("clazzId") String clazzId,
			Model model
			){
		
		model.addAttribute("assessClazz",
				service.queryAssessGroupByCourseClazzStudent(
						teacher.getId(), courseId, clazzId));
		
		return "teacher/assessClazz";
	}
	
	@Autowired
	StudentServiceImpl studentService;
	
	@RequestMapping("/studentAssessInfo")
	public String assessInfo(
			@RequestParam("coreId") Integer assessId,
			Model model) {
		
		List<QuestionAndAnswerRespDto> listQ = 
				service.queryQuestionAndAnswer(assessId);
		model.addAttribute("questions", listQ);
		
		model.addAttribute("advice",
				studentService.queryAssessAdvice(assessId));
		
		return "teacher/studentAssessInfo";
		
	}

}
