package com.lc.evaluation.control.student;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.lc.evaluation.control.util.MsgType;
import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dto.request.UserLoginDto;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.basic.AbstractUserService;
import com.lc.evaluation.service.impl.StudentServiceImpl;

@Controller
@RequestMapping("/student")
@SessionAttributes(value = { UserType.userType })
public class OnlineStatusController {

	Logger log = LogManager.getLogger(OnlineStatusController.class);

	@Autowired
	StudentServiceImpl service;

	
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String login(@ModelAttribute UserLoginDto userDto, String error, Model model) {
		log.info("student login");
		log.info("userName " + userDto.getUserName());
		log.info("password " + userDto.getPassword());
		if(error != null){
			model.addAttribute(MsgType.error, "用户名或密码错误");
			return "redirect:login";
		}
		if (((AbstractUserService) service).logIn(userDto)) {
			Student stu = service.findByUserName(userDto.getUserName());
			model.addAttribute(UserType.userType, stu);
			return "redirect:student/main";
		}
		return "forward:login?error='用户名或密码错误'";
	}

}
