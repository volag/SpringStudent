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
@SessionAttributes({UserType.userType})
public class TeacherPersonMsg {
	
	Logger log = LogManager.getLogger(TeacherPersonMsg.class);
	
	@Autowired
	TeacherServiceImpl service;

	@RequestMapping("/msg")
	public String queryCourses(@ModelAttribute(UserType.userType) Teacher teacher, Model model) {
		
		log.info("stu.getUserName() " + teacher.getUserName());
		model.addAttribute("teacher", service.findByUserName(teacher.getUserName()));
		return "teacher/msg";
		
	}
	
	
	
}
