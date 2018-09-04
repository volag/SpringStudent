package com.lc.evaluation.control.admin;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lc.evaluation.dto.response.LogDto;
import com.lc.evaluation.service.LogService;

@Controller
@RequestMapping("/admin/service")
public class LogManage {
	
	Logger log = LogManager.getLogger(LogManage.class);

	@Autowired
	LogService service;
	
	/**
	 * 查询所有日志
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/queryAllLog")
	public String queryAllLogs(
				Model model){
		model.addAttribute("logList", service.queryAllTime());
		return "admin/logManage";
	}
	
	/**
	 * 查询当天的日志
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/queryTodayLogs")
	public String queryTodayLogs(
				Model model){
		Date date = new Date();
		List<LogDto> logList = service.queryTodayLogs(date);
		model.addAttribute("logList", logList);
		return "admin/logManage";
	}
	
	/**
	 * 查询这个月的日志信息
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/queryThisMonthLogs")
	public String queryThisMonthLogs(
				Model model){
		Date date = new Date();
		model.addAttribute("logList", service.queryThisMonthLogs(date));
		return "admin/logManage";
	}
	
	/**
	 * 查询七天之内的日志信息
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/query7DayLogs")
	public String query7DayLogs(
				Model model){
		Date date = new Date();
		model.addAttribute("logList", service.query7DayLogs(date));
		return "admin/logManage";
	}

}
