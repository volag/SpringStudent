package com.lc.evaluation.control.admin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lc.evaluation.service.impl.TeacherServiceImpl;

@Controller
@RequestMapping("/admin/service")
public class TeacherManage {
	
	Logger log = LogManager.getLogger(TeacherManage.class);

	@Autowired
	TeacherServiceImpl teacherService;
	/**
	 * 查询所有老师信息
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/queryTeacher")
	public String queryteacher(
				Model model){
		model.addAttribute("teacherList", teacherService.queryAll());
		return "admin/teacherManage";
	}
	
	/**
	 * 查询单个老师的个人信息
	 * @param teacherId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/queryTeacherById")
	public String queryteacherById(
			@RequestParam ("teacherId") Integer  teacherId,
			Model model){
		
		model.addAttribute("teacher", teacherService.query(teacherId));
		return "admin/teaMessage";
	}
	

}
