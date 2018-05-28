package com.lc.evaluation.control.admin;

import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lc.evaluation.service.impl.AdminServiceImpl;

@Controller
@RequestMapping("/admin/service")
public class LogManage {
	
	Logger log = LogManager.getLogger(LogManage.class);

	@Autowired
	AdminServiceImpl service;
	
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String queryBySection(
			@RequestParam("startTime") Date startTime, 
			Date endTime){
		return null;
	}
	

}
