package com.lc.evaluation.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lc.evaluation.dao.AnswerMapper;
import com.lc.evaluation.dao.CoreMapper;
import com.lc.evaluation.dao.CourseMapper;
import com.lc.evaluation.dao.QuestionMapper;
import com.lc.evaluation.dao.impl.AdminMapperImpl;
import com.lc.evaluation.dao.impl.TeacherMapperImpl;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.entity.Answer;
import com.lc.evaluation.entity.Core;
import com.lc.evaluation.entity.Question;
import com.lc.evaluation.service.AdminService;
import com.lc.evaluation.service.basic.AbstractUserService;
import com.lc.evaluation.service.basic.CanQueryQuestionAndAnswer;

@Service
public class AdminServiceImpl 
	extends AbstractUserService<Admin> 
	implements AdminService,
	CanQueryQuestionAndAnswer{
	
	private AdminMapperImpl adminMapper;
	
	@Autowired
	private CoreMapper coreMapper;
	
	@Autowired
	public AdminServiceImpl(AdminMapperImpl userMapper) {
		super(userMapper);
		this.adminMapper = userMapper;
	}


	@Autowired
	CourseMapper courseMapper;

	
	@Autowired
	AnswerMapper answerMapper;
	@Autowired
	QuestionMapper questionMapper;
	@Autowired
	TeacherMapperImpl teacherMapper;
	
	@Override
	public List<QuestionAndAnswerRespDto> queryQuestionAndAnswer(Integer assessId) {
		
		Answer ans = new Answer();
		ans.setAssessId(assessId);
		List<Answer> listAnswers = answerMapper.findByMap(ans);
		
		List<QuestionAndAnswerRespDto> listDto = 
				new ArrayList<>();
		for (Answer answer : listAnswers) {
			Question ques = questionMapper.findById(answer.getQuestionId());
			QuestionAndAnswerRespDto dto = 
					new QuestionAndAnswerRespDto();
			dto.setAnswer(answer.getAnswer());
			dto.setAnswerId(answer.getId());
			dto.setQuestionContext(ques.getContext());
//			dto.setAssessId(answer.getAssessId());
			listDto.add(dto);
		}
		return listDto;
	}

	
	
	
}
