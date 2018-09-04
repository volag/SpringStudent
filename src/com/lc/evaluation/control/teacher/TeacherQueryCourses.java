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
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.impl.TeacherServiceImpl;
@Controller
@RequestMapping("/teacher/service")
@SessionAttributes({UserType.userType})
public class TeacherQueryCourses {
	
	Logger log = LogManager.getLogger(TeacherQueryCourses.class);
	
	@Autowired
	TeacherServiceImpl service;

	@RequestMapping("/queryCourses")
	public String queryCourses(
			@ModelAttribute(UserType.userType) Student teacher, 
			Model model) {
		
		log.info("teacher.getUserName() " + teacher.getUserName());
		model.addAttribute("courses",
				service.queryCourses(teacher.getId()));
		return "teacher/courses";
		
	}
	
	
	
}
