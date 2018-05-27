package com.lc.evaluation.control.student;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lc.evaluation.control.util.UserType;
import com.lc.evaluation.dto.request.AnswerRequestDto;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.impl.StudentServiceImpl;

@Controller
@RequestMapping("/student/service")
@SessionAttributes({UserType.userType})
public class StudentAssess {
	
	Logger log = LogManager.getLogger(StudentAssess.class);
	
	@Autowired
	StudentServiceImpl service;

	@RequestMapping("/assess")
	public String assess(
			@ModelAttribute(UserType.userType) Student stu,
			@RequestParam("coreId") Integer assessId,
			Model model) {
		
		log.info("assess -----");
		if(! service.isAssess(stu.getId())){
			return null;
		}
		List<QuestionAndAnswerRespDto> listQ = service.queryQuestionAndAnswer(assessId);
		model.addAttribute("questions", listQ);
		model.addAttribute("assessId", assessId);
//		log.info("assessId "+ assessId);
//		log.info("question.size() " + listQ.size());
		return "student/assess";
		
	}
	
	@RequestMapping("/assessInfo")
	public String assessInfo(
			@ModelAttribute(UserType.userType) Student stu,
			@RequestParam("coreId") Integer assessId,
			Model model) {
		
		if(service.isAssess(stu.getId())){
			return null;
		}
		List<QuestionAndAnswerRespDto> listQ = 
				service.queryQuestionAndAnswer(assessId);
		model.addAttribute("questions", listQ);
		log.info("question.size() " + listQ.size());
		return "student/assess";
		
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
//			System.out.println("ans " + request.getParameter("answer"+(i + 1)));
			answers.add((String)request.getParameter("answer"+(i + 1)) + "");
		}
		
		service.submitAssessQuestionAndAnswer(answerIds, answers);
		service.submitAdviceAndCore(assessId, answers, advice);
		
		return "student/assessResult";
	}
	
}
