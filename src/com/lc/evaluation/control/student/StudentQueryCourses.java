package com.lc.evaluation.control.student;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.MsgType;
import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dto.response.StudentCourseRespDto;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.impl.StudentServiceImpl;
@Controller
@RequestMapping("/student/service")
@SessionAttributes({UserType.userType})
public class StudentQueryCourses {
	
	Logger log = LogManager.getLogger(StudentQueryCourses.class);
	
	@Autowired
	StudentServiceImpl service;

	@RequestMapping("/courses")
	public String queryCourses(
			@ModelAttribute(UserType.userType) Student stu,
			String msg,
			Model model) {
		
		model.addAttribute(MsgType.msg, msg);
		
		List<StudentCourseRespDto> courses = service.queryCourses(stu.getId());
		model.addAttribute("courses", courses);
		log.info("courses.size() " + courses.size());
		return "student/courses";
		
	}
	
	@RequestMapping("/courses/{type}")
	public String queryCoursesByType(
			@ModelAttribute(UserType.userType) Student stu,
			@PathVariable("type") String type,
			Model model) {
		log.info("student id : " + stu.getId());
		List<StudentCourseRespDto> courses =
				service.queryCoursesByType(stu.getId(), type);
		model.addAttribute("courses", courses);
        for(StudentCourseRespDto cou:courses){
        	System.out.println(cou);
        }
		return "student/courses";
		
	}
	
	
	
}
