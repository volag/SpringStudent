package com.lc.evaluation.control.admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lc.evaluation.control.util.MsgType;
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.service.impl.AdminServiceImpl;

@Controller
@RequestMapping("/admin/service")
public class AdminManage {
	
	Logger log = LogManager.getLogger(AdminManage.class);

	@Autowired
	AdminServiceImpl adminService;
	
	/**
	 * 显示所有管理员信息
	 * @param msg
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/adminManage")
	public String queryStudentById(String msg,
			Model model){
		model.addAttribute(MsgType.msg, msg);
		model.addAttribute("adminList", adminService.queryAll());
		return "admin/adminManage";
	}
	
	/**
	 * 查询管理员个人信息
	 * @param adminId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/queryAdminById")
	public String queryStudentById(
			@RequestParam ("id") Integer  adminId,
			Model model){
		model.addAttribute("student", adminService.query(adminId));
		return "admin/msg";
	}
	

	/**
	 * 增加管理员页面
	 * @return
	 */
	@RequestMapping(value = "/adminAdd")
	public String addAdmin(){
		return "admin/adminAdd";
	}
	
	/**
	 * 提交增加管理员的信息
	 * @param admin
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/sumbitAddAdmin")
	public String sumbitAddAdmin(
			Admin admin,
			Model model){
		admin.setUserType(2);
		adminService.add(admin);
		model.addAttribute(MsgType.msg,"添加成功！");
		return "redirect:adminManage";
	}
}
