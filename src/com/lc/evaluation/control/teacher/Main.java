package com.lc.evaluation.control.teacher;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class Main {
	
	Logger log = LogManager.getLogger(Main.class);
	
	@RequestMapping("/main")
	public String studnetManage() {
		return "redirect:service/courses";
	}
	
}
