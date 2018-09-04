package com.lc.evaluation.control.teacher;

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
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.service.impl.TeacherServiceImpl;
@Controller
@RequestMapping("/teacher/service")
@SessionAttributes({UserType.userType})
public class TeacherChangePassword {
	
	Logger log = LogManager.getLogger(TeacherChangePassword.class);
	
	@Autowired
	TeacherServiceImpl service;

	@RequestMapping(value = "/changePassword", method= RequestMethod.POST)
	public String changePassword(
			@ModelAttribute(UserType.userType) Teacher stu,
			@RequestParam("oldPassword") String oldPassword, 
			@RequestParam("newPassword") String newPassword,
			Model model) {
		
		if(service.modifyPassword(
				stu.getUserName(), oldPassword, newPassword)){
			model.addAttribute(MsgType.msg, "修改密码成功！");
			return "teacher/changePassword";
		}
		model.addAttribute(MsgType.msg, "修改密码失败");
		return "teacher/changePassword";
	}
	
	
	@RequestMapping("/changePasswordPage")
	public String changePasswordPage(
			Model model) {
		
		return "teacher/changePassword";
		
	}
	
	
}
