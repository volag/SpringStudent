package com.lc.evaluation.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.lc.evaluation.dao.AnswerMapper;
import com.lc.evaluation.dao.CoreMapper;
import com.lc.evaluation.dao.CourseMapper;
import com.lc.evaluation.dao.QuestionMapper;
import com.lc.evaluation.dao.impl.AdminMapperImpl;
import com.lc.evaluation.dto.basic.BasicResponseDto;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.entity.Answer;
import com.lc.evaluation.entity.Question;
import com.lc.evaluation.service.AdminService;
import com.lc.evaluation.service.basic.AbstractUserService;
import com.lc.evaluation.service.basic.CanQueryQuestionAndAnswer;

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

	@Override
	public BasicResponseDto<Admin> query(Serializable id) {
		// TODO Auto-generated method stub
//		return studentMapper.findById(id);
		return null;
	}

	@Override
	public List<BasicResponseDto<Admin>> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BasicResponseDto<Admin>> queryPage(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	CourseMapper courseMapper;

	
	@Autowired
	AnswerMapper answerMapper;
	@Autowired
	QuestionMapper questionMapper;
	
	@Override
	public List<QuestionAndAnswerRespDto> queryQuestionAndAnswer(Integer assessId) {
		
		Map map = new HashMap();
		map.put(AnswerMapper.assessId, assessId);
		List<Answer> listAnswers = answerMapper.findByMap(map);
		
		List<QuestionAndAnswerRespDto> listDto = 
				new ArrayList<>();
		for (Answer answer : listAnswers) {
			Question ques = questionMapper.findById(answer.getQuestionId());
			QuestionAndAnswerRespDto dto = 
					new QuestionAndAnswerRespDto();
			dto.setAnswer(answer.getAnswer());
			dto.setAnswerId(answer.getId());
			dto.setQuestionContext(ques.getContext());
			listDto.add(dto);
		}
		return listDto;
	}
	
	
	
}
