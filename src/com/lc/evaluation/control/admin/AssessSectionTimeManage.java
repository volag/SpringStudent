package com.lc.evaluation.control.admin;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lc.evaluation.control.util.MsgType;
import com.lc.evaluation.service.impl.AssessTimeSectionServiceImpl;
import com.lc.evaluation.util.WorkDate;

@Controller
@RequestMapping("/admin/service")
public class AssessSectionTimeManage {
	
	Logger log = LogManager.getLogger(AssessSectionTimeManage.class);

	@Autowired
	AssessTimeSectionServiceImpl service;
	
	/**
	 * 设置评教时间
	 * @param startTime
	 * @param endTime
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/setAssessTimeSection")
	public String setAssessTimeSection(
			@RequestParam("startTime") String startTime, 
			@RequestParam("endTime") String endTime,
			Model model){
		
		service.setSectionStartTime(WorkDate.toDate(startTime));
		service.setSectionEndTime(WorkDate.toDate(endTime));
        model.addAttribute(MsgType.msg, "设置成功！");
        
		return "redirect:queryAssessTimeSection";
	}
	
	/**
	 * 查询评教时间段
	 * @param model
	 * @param msg
	 * @return
	 */
	@RequestMapping(value = "/queryAssessTimeSection")
	public String queryAssessTimeSection(Model model,String msg){
		
		model.addAttribute("sectionTime", service.getAssessTimeSection());
		model.addAttribute(MsgType.msg, msg);
		return "admin/assessTimeManage";
	}

}
