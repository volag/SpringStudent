package com.lc.evaluation.control;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {
	
	Logger log = LogManager.getLogger(Index.class);
	
	@RequestMapping("/")
	public String studnetManage() {
		return "redirect:loginPage";
	}
	
}