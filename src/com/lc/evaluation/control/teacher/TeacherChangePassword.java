package com.lc.evaluation.control.teacher;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.service.impl.StudentServiceImpl;

@Controller
@RequestMapping("/teacher/service")
@SessionAttributes({UserType.userType})
public class TeacherChangePassword {
	
	Logger log = LogManager.getLogger(TeacherChangePassword.class);
	
	@Autowired
	StudentServiceImpl service;

	@RequestMapping(value = "/changePassword", method= RequestMethod.POST)
	public String changePassword(
			@ModelAttribute(UserType.userType) Teacher stu,
			@RequestParam("oldPassword") String oldPassword, 
			@RequestParam("newPassword") String newPassword,
			Model model) {
		
		log.info("stu.getUserName() " + stu.getUserName());
		log.info("oldPassword " + oldPassword);
		log.info("newPassword " + newPassword);
		
		if(service.modifyPassword(
				stu.getUserName(), oldPassword, newPassword)){
			return "redirect:changePasswordPage?msg=SUCCESS";
		}
		
		return "redirect:changePasswordPage?msg=FAILED";
		
	}
	
	
	@RequestMapping("/changePasswordPage")
	public String changePasswordPage(
			String msg,
			Model model) {
		
		model.addAttribute("msg", msg);
		return "teacher/changePasswordPage";
		
	}
	
	
}
