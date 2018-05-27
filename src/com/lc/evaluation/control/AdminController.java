package com.lc.evaluation.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping("/studentManage")
	public String studnetManage() {
		return "admin/studentManage";
	}
	
	@RequestMapping("/teacherManage")
	public String teacherManage() {
		return "admin/teacherManage";
	}
	
	@RequestMapping("/adminManage")
	public String adminManage() {
		return "admin/adminManage";
	}
	
	@RequestMapping("/advManage")
	public String advManage() {
		return "admin/advManage";
	}
	
	@RequestMapping("/assessResult")
	public String assessResult() {
		return "admin/assessResult";
	}
	
	@RequestMapping("/changePassword")
	public String changePassword() {
		return "admin/changePassword";
	}
	
	@RequestMapping("/personMessage")
	public String personMessage() {
		return "admin/personMessage";
	}
}
