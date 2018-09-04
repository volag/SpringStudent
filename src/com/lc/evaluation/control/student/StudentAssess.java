package com.lc.evaluation.control.student;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.MsgType;
import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.impl.AssessTimeSectionServiceImpl;
import com.lc.evaluation.service.impl.StudentServiceImpl;
@Controller
@RequestMapping("/student/service")
@SessionAttributes({UserType.userType})
public class StudentAssess {
	
	Logger log = LogManager.getLogger(StudentAssess.class);
	
	
	@Autowired
	StudentServiceImpl service;
	@Autowired
	AssessTimeSectionServiceImpl assessTimeSectionService;

	@RequestMapping("/assess")
	public String assess(
			@ModelAttribute(UserType.userType) Student stu,
			@RequestParam("coreId") Integer assessId,
			Model model) {
		
		List<QuestionAndAnswerRespDto> listQ = service.queryQuestionAndAnswer(assessId);
		model.addAttribute("questions", listQ);
		model.addAttribute("assessId", assessId);
		
		if(service.isCourseAssess(assessId) 
				&& assessTimeSectionService.canAssess() ){
			return "student/assess";
		}
		else{
			model.addAttribute(MsgType.msg, "您已评教或者不在评教时间段");
			return "redirect:courses";
		}
	}
	

	
	@RequestMapping("/assessInfo")
	public String assessInfo(
			@ModelAttribute(UserType.userType) Student stu,
			@RequestParam("coreId") Integer assessId,
			Model model) {
		
		List<QuestionAndAnswerRespDto> listQ = 
				service.queryQuestionAndAnswer(assessId);
		model.addAttribute("questions", listQ);
		
		model.addAttribute("advice",
				service.queryAssessAdvice(assessId));
		
		return "student/studentAssessInfo";
		
	}
	
	@RequestMapping(value = "/assessSubmit" , method=RequestMethod.POST)
	public String assessSubmit(
			@ModelAttribute(UserType.userType) Student stu,
			HttpServletRequest request,
			@RequestParam("answerId") List<Integer> answerIds,
			@RequestParam("advice") String advice,
			@RequestParam("assessId") Integer assessId,
			Model model) {
		
		List<String> answers = new ArrayList<>();
		for(int i = 0; i < answerIds.size(); i ++){
			answers.add((String)request.getParameter("answer"+(i + 1)) + "");
		}
		
		service.submitAssessQuestionAndAnswer(answerIds, answers);
		service.submitAdviceAndCore(assessId, answers, advice);
		model.addAttribute(MsgType.msg, "评教成功！");
		return "redirect:courses";
	}
	
}
