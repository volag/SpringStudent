package com.lc.evaluation.control.student;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dto.request.UserLoginDto;
import com.lc.evaluation.service.basic.AbstractUserService;
import com.lc.evaluation.service.impl.StudentServiceImpl;

@Controller
@RequestMapping("/student")
public class Main {
	
	Logger log = LogManager.getLogger(Main.class);
	
	@Autowired
	StudentServiceImpl service;

	@RequestMapping("/main")
	public String studnetManage() {
		return "redirect:service/courses";
	}
	
}
