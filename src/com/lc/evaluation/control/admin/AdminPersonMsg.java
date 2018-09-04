package com.lc.evaluation.control.admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.service.impl.AdminServiceImpl;
@Controller
@RequestMapping("/admin/service")
@SessionAttributes({UserType.userType})
public class AdminPersonMsg {
	
	Logger log = LogManager.getLogger(AdminPersonMsg.class);
	
	@Autowired
	AdminServiceImpl service;

	/**
	 * 查询个人信息
	 * @param admin
	 * @param model
	 * @return
	 */
	@RequestMapping("/msg")
	public String queryCourses(@ModelAttribute(UserType.userType) Admin admin, Model model) {
		
		model.addAttribute("admin", service.findByUserName(admin.getUserName()));
		return "admin/msg";
		
	}
	
	
	
}
