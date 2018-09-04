package com.lc.evaluation.control.teacher;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.service.impl.TeacherServiceImpl;
@Controller
@RequestMapping("/teacher/service")
@SessionAttributes({UserType.userType, "assessCourses", "assessClazz"})
public class TeacherQueryAdvices {
	
	Logger log = LogManager.getLogger(TeacherQueryAdvices.class);
	
	@Autowired
	TeacherServiceImpl service;
	
	@RequestMapping("/assessAdvice")
	public String queryAllAdvice(
			@ModelAttribute(UserType.userType) Teacher teacher,
			Model model
			){
		model.addAttribute("assessAdvice",
				service.queryAssessGroupByCourseClazzStudent(
						teacher.getId(), null, null));
//		log.info("queryAllAdvice : " + service.queryAssessGroupByCourseClazzStudent(
//						teacher.getId(), 1, "152011").size());
		return "teacher/assessAdvice";
	}
	
}
