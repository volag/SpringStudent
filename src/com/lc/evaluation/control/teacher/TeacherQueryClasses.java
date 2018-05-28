package com.lc.evaluation.control.teacher;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
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
@SessionAttributes({UserType.userType, "clazzes"})
public class TeacherQueryClasses {
	
	Logger log = LogManager.getLogger(TeacherQueryClasses.class);
	
	@Autowired
	TeacherServiceImpl service;

	@RequestMapping("/queryClazzes")
	public String queryClazzes(
			@ModelAttribute(UserType.userType) Teacher teacher, 
			Model model, HttpRequest httpRequest) {
		
		log.info("teacher.getUserName() " + teacher.getUserName());
		model.addAttribute("clazzes",
				service.queryClasses(teacher.getId(), null));
		
		return "teacher/clazzes";
		
	}
	
}
