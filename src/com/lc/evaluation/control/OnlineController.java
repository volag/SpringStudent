package com.lc.evaluation.control;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.lc.evaluation.dto.request.UserLoginDto;
import com.lc.evaluation.service.impl.StudentServiceImpl;

@Controller
public class OnlineController {

	Logger log = LogManager.getLogger(OnlineController.class);

	@Autowired
	StudentServiceImpl service;

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String login(@ModelAttribute UserLoginDto userDto, Model model) {
		log.info("loginController login");
		log.info(userDto.getUserType());
		if (userDto.getUserType() != null) {
			model.addAttribute(userDto);
			switch (userDto.getUserType()) {
			case admin:
				return "forward:admin/login";
			case student:
				return "forward:student/login";
			case teacher:
				return "forward:teacher/login";
			}
		}
		return "redirect:util/error";
	}

	@RequestMapping(value = "/logout", method = { RequestMethod.GET})
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "login";
	}
}
