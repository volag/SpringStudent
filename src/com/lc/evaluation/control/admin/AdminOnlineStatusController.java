package com.lc.evaluation.control.admin;
import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.service.basic.AbstractUserService;
import com.lc.evaluation.service.impl.AdminServiceImpl;

@Controller
@RequestMapping("/admin")
@SessionAttributes(value = { UserType.userType })
public class AdminOnlineStatusController {

	Logger log = LogManager.getLogger(AdminOnlineStatusController.class);

	@Autowired
	AdminServiceImpl service;
	
	/**
	 * 验证登录信息
	 * @param userDto
	 * @param error
	 * @param model
	 * @param request
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String login(
			@ModelAttribute UserLoginDto userDto, 
			String error, Model model, HttpServletRequest request) {
		log.info("admin login");
		log.info("userName " + userDto.getUserName());
		log.info("password " + userDto.getPassword());
		if(error != null){
			model.addAttribute(MsgType.error, "用户名或密码错误");
			return "redirect:login";
		}
		if (((AbstractUserService) service).logIn(userDto)) {
			Admin adm = service.findByUserName(userDto.getUserName());
			System.out.println("tea : " + adm);
			model.addAttribute(UserType.userType, adm);
			request.getSession().setAttribute(UserType.userType, adm);
			return "redirect:admin/main";
		}
		model.addAttribute(MsgType.error, "用户名或密码错误!");
		return "redirect:loginPage";
	}

}
