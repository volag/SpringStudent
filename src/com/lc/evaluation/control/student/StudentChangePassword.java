package com.lc.evaluation.control.student;

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
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.impl.StudentServiceImpl;
@Controller
@RequestMapping("/student/service")
@SessionAttributes({UserType.userType})
public class StudentChangePassword {
	
	Logger log = LogManager.getLogger(StudentChangePassword.class);
	
	@Autowired
	StudentServiceImpl service;

	@RequestMapping(value = "/changePassword", method= RequestMethod.POST)
	public String changePassword(
			@ModelAttribute(UserType.userType) Student stu,
			@RequestParam("oldPassword") String oldPassword, 
			@RequestParam("newPassword") String newPassword,
			Model model) {
		
		log.info("stu.getUserName() " + stu.getUserName());
		log.info("oldPassword " + oldPassword);
		log.info("newPassword " + newPassword);
		
		if(service.modifyPassword(
				stu.getUserName(), oldPassword, newPassword)){
			model.addAttribute(MsgType.msg, "修改密码成功！");
			return "student/changePassword";
		}
		model.addAttribute(MsgType.msg, "修改密码失败");
		return "student/changePassword";
		
	}
	
	
	@RequestMapping("/changePasswordPage")
	public String changePasswordPage(
			Model model) {
		return "student/changePassword";
		
	}
	
	
}
