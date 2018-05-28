package com.lc.evaluation.control.teacher;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.MsgType;
import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dto.request.UserLoginDto;
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.service.basic.AbstractUserService;
import com.lc.evaluation.service.impl.TeacherServiceImpl;

@Controller
@RequestMapping("/teacher")
@SessionAttributes(value = { UserType.userType })
public class TeacherOnlineStatusController {

	Logger log = LogManager.getLogger(TeacherOnlineStatusController.class);

	@Autowired
	TeacherServiceImpl service;
	
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String login(@ModelAttribute UserLoginDto userDto, 
			String error, Model model) {
		log.info("teacher login");
		log.info("userName " + userDto.getUserName());
		log.info("password " + userDto.getPassword());
		if(error != null){
			model.addAttribute(MsgType.error, "用户名或密码错误");
			return "redirect:login";
		}
		if (((AbstractUserService) service).logIn(userDto)) {
			Teacher tea = service.findByUserName(userDto.getUserName());
			System.out.println("tea : " + tea);
			model.addAttribute(UserType.userType, tea);
			return "redirect:teacher/main";
		}
		return "forward:login?error='用户名或密码错误'";
	}

}
