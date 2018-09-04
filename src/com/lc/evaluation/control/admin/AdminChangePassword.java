package com.lc.evaluation.control.admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.MsgType;
import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.service.impl.AdminServiceImpl;
import com.lc.evaluation.service.impl.StudentServiceImpl;
@Controller
@RequestMapping("/admin/service")
@SessionAttributes({UserType.userType})
public class AdminChangePassword {
	
	Logger log = LogManager.getLogger(AdminChangePassword.class);
	
	@Autowired
	AdminServiceImpl service;

	/**
	 * 管理员修改密码
	 * @param stu
	 * @param oldPassword
	 * @param newPassword
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/changePassword", method= RequestMethod.POST)
	public String changePassword(
			@ModelAttribute(UserType.userType) Admin stu,
			@RequestParam("oldPassword") String oldPassword, 
			@RequestParam("newPassword") String newPassword,
			Model model) {
		
		if(service.modifyPassword(
				stu.getUserName(), oldPassword, newPassword)){
			model.addAttribute(MsgType.msg, "修改密码成功！");
			return "admin/changePassword";
		}
		model.addAttribute(MsgType.msg, "修改密码失败");
		return "admin/changePassword";
		
	}
	
	/**
	 * 跳转修改密码的页面
	 * @param model
	 * @return
	 */
	@RequestMapping("/changePasswordPage")
	public String changePasswordPage(
			Model model) {
		
		return "admin/changePassword";
		
	}
	
	
}
