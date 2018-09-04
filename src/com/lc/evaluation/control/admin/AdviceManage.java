package com.lc.evaluation.control.admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.evaluation.service.AdminService;

@Controller
@RequestMapping("/admin/service")
public class AdviceManage {
	
	Logger log = LogManager.getLogger(AdviceManage.class);

	@Autowired
	AdminService service;
	
	/**
	 * 查询所有的意见信息
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/advManage")
	public String queryStudent(
				Model model){
		log.info("num:"+service.queryAssessAllAdvice().size());
		model.addAttribute("adviceList", service.queryAssessAllAdvice());
		return "admin/advManage";
	}

}
