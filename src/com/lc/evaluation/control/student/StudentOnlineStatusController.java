package com.lc.evaluation.control.student;

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
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.basic.AbstractUserService;
import com.lc.evaluation.service.impl.StudentServiceImpl;
@Controller
@RequestMapping("/student")
@SessionAttributes(value = { UserType.userType })
public class StudentOnlineStatusController {

	Logger log = LogManager.getLogger(StudentOnlineStatusController.class);

	@Autowired
	StudentServiceImpl service;

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public String login(@ModelAttribute UserLoginDto userDto,
			/*String error,*/ Model model, HttpServletRequest request) {
		log.info("student login");
		log.info("userName " + userDto.getUserName());
		log.info("password " + userDto.getPassword());
		/*if(error != null){
			
			return "redirect:loginPage";
		}*/
		if (((AbstractUserService) service).logIn(userDto)) {
			Student stu = service.findByUserName(userDto.getUserName());
			model.addAttribute(UserType.userType, stu);
			request.getSession().setAttribute(UserType.userType, stu);
			return "redirect:student/main";
		}
		model.addAttribute(MsgType.error, "用户名或密码错误!");
		return "redirect:loginPage";
	}

}
