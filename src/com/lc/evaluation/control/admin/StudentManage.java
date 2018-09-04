package com.lc.evaluation.control.admin;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lc.evaluation.service.impl.StudentServiceImpl;

@Controller
@RequestMapping("/admin/service")
public class StudentManage {
	
	Logger log = LogManager.getLogger(StudentManage.class);

	@Autowired
	StudentServiceImpl studentService;
	
	/**
	 * 查询所有的学生信息
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/queryStudent")
	public String queryStudent(
				Model model){
		model.addAttribute("studentList", studentService.queryAll());
		return "admin/studentManage";
	}
	
	/**
	 * 通过学生Id查询学生的个人信息
	 * @param studentId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/queryStudentById")
	public String queryStudentById(
			@RequestParam ("id") Integer  studentId,
			Model model){
		model.addAttribute("student", studentService.query(studentId));
		return "admin/stuMessage";
	}
	

}
