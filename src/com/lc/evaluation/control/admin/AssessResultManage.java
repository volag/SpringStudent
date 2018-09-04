package com.lc.evaluation.control.admin;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dto.response.AdminAssessAllResultDto;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.service.impl.AdminServiceImpl;
import com.lc.evaluation.service.impl.StudentServiceImpl;
import com.lc.evaluation.service.impl.TeacherServiceImpl;

@Controller
@RequestMapping("/admin/service")
public class AssessResultManage {
	
	Logger log = LogManager.getLogger(AssessResultManage.class);

	@Autowired
	AdminServiceImpl adminService;
	
	/**
	 * 查询所有评教结果
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/assessResult")
	public String queryStudent(
				Model model){
		List<AdminAssessAllResultDto> assessResultList = adminService.queryAssessAllResult();
		model.addAttribute("assessResultList", assessResultList);
		return "admin/assessResult";
	}
	
	@Autowired
	TeacherServiceImpl teacherService;
	
	/**
	 * 查询学生对老师课程的评价结果
	 * @param teacherId
	 * @param courseId
	 * @param clazzId
	 * @param model
	 * @return
	 */
	@RequestMapping("/queryStudentAssessInfo")
	public String queryAssessClazz(
			@ModelAttribute("teacherId") Integer teacherId,
			@ModelAttribute("courseId") Integer courseId,
			@ModelAttribute("clazzId") String clazzId,
			Model model
			){
		log.info("teacherId"+teacherId+"courseId"+courseId+"clazzId"+clazzId);
		log.info("queryAssessClazz : " + teacherService.queryAssessGroupByCourseClazzStudent(
				teacherId, courseId, clazzId).size());
		model.addAttribute("studentAssessInfoList",
				teacherService.queryAssessGroupByCourseClazzStudent(
						teacherId, courseId, clazzId));
		
		return "admin/assessResultTSG";
	}
	
	@Autowired
	StudentServiceImpl studentService;
	
	/**
	 * 学生对老师的评价答案
	 * @param assessId
	 * @param model
	 * @return
	 */
	@RequestMapping("/studentAssessInfo")
	public String assessInfo(
			@RequestParam("coreId") Integer assessId,
			Model model) {
	    log.info("*****"+assessId);
		
		List<QuestionAndAnswerRespDto> listQ = 
				studentService.queryQuestionAndAnswer(assessId);
		model.addAttribute("questions", listQ);
		
		model.addAttribute("advice",
				studentService.queryAssessAdvice(assessId));
		
		return "admin/studentAssessInfo";
		
	}
}