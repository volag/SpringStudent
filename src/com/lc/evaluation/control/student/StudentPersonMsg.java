package com.lc.evaluation.control.student;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.impl.StudentServiceImpl;
@Controller
@RequestMapping("/student/service")
@SessionAttributes({UserType.userType})
public class StudentPersonMsg {
	
	Logger log = LogManager.getLogger(StudentPersonMsg.class);
	
	@Autowired
	StudentServiceImpl service;

	@RequestMapping("/msg")
	public String queryCourses(@ModelAttribute(UserType.userType) Student stu, Model model) {
		
		log.info("stu.getUserName() " + stu.getUserName());
		model.addAttribute("student", service.findByUserName(stu.getUserName()));
		return "student/msg";
		
	}
	
	
	
}
