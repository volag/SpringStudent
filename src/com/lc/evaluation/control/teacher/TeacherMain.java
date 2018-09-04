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
@RequestMapping("/teacher")
@SessionAttributes({UserType.userType, "clazzes"})
public class TeacherMain {
	
	Logger log = LogManager.getLogger(TeacherMain.class);
	
	@Autowired
	TeacherServiceImpl service;
	
	@RequestMapping("/main")
	public String studnetManage(
			@ModelAttribute(UserType.userType) Teacher teacher, 
			Model model) {
		
//		log.info("teacher.getUserName() : " + teacher.getUserName());
//		log.info("teacher.getId() : " + teacher);
//		model.addAttribute("clazzes",
//				service.queryClasses(teacher.getId(), null));
//		
//		model.addAttribute("courseAssessSimple",
//				service.queryAssessGroupByCourseClazz(teacher.getId()));
//		
		
		return "redirect:service/assessCourses";
	}
	
}


