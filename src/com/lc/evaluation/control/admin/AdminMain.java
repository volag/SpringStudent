package com.lc.evaluation.control.admin;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.service.impl.TeacherServiceImpl;

@Controller
@RequestMapping("/admin")
@SessionAttributes({UserType.userType, "clazzes"})
public class AdminMain {
	
	Logger log = LogManager.getLogger(AdminMain.class);
	
	@Autowired
	TeacherServiceImpl service;
	
	@RequestMapping("/main")
	public String main(
			@ModelAttribute(UserType.userType) Admin admin, 
			Model model) {
		
		return "redirect:service/assessCourses";
		
	}
	
}


