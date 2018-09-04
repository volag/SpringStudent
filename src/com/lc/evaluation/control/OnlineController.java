package com.lc.evaluation.control;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.lc.evaluation.control.util.MsgType;
import com.lc.evaluation.dto.request.UserLoginDto;
import com.lc.evaluation.service.impl.StudentServiceImpl;

@Controller
public class OnlineController {

	Logger log = LogManager.getLogger(OnlineController.class);

	@Autowired
	StudentServiceImpl service;
	
	@RequestMapping(value = "/loginPage", method = { RequestMethod.GET })
	public String loginPage(String error, Model model) {
		log.info("loginController loginPage");
		model.addAttribute(MsgType.error, error);
		return "login";
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String loginA(@ModelAttribute UserLoginDto userDto, Model model) {
		log.info("loginController login");
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
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/";
	}
}
