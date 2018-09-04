package com.lc.evaluation.control.student;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.evaluation.service.impl.StudentServiceImpl;
@Controller
@RequestMapping("/student")
public class StudentMain {
	
	Logger log = LogManager.getLogger(StudentMain.class);
	
	@Autowired
	StudentServiceImpl service;

	@RequestMapping("/main")
	public String studnetManage() {
		return "redirect:service/courses";
	}
	
}
