package com.lc.evaluation.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lc.evaluation.dao.AnswerMapper;
import com.lc.evaluation.dao.impl.StudentMapperImpl;
import com.lc.evaluation.dto.basic.BasicResponseDto;
import com.lc.evaluation.dto.basic.BasicResponseMapDto;
import com.lc.evaluation.dto.request.AnswerRequestDto;
import com.lc.evaluation.dto.response.StudentCourseRespDto;
import com.lc.evaluation.entity.Answer;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.StudentService;
import com.lc.evaluation.service.basic.AbstractUserService;

public class StudentServiceImpl 
	extends AbstractUserService<Student> 
	implements StudentService{
	
	
	private StudentMapperImpl userMapper;

	@Autowired
	public StudentServiceImpl(StudentMapperImpl userMapper) {
		super(userMapper);
		this.userMapper = userMapper;
	}

	@Override
	public BasicResponseDto<Student> query(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BasicResponseDto<Student>> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BasicResponseDto<Student>> queryPage(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delele(Serializable... ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BasicResponseMapDto queryCourses(Integer id) {
		BasicResponseMapDto resp = new StudentCourseRespDto()
				.init(userMapper.findCourses(id));
		return resp;
	}

	@Autowired
	AnswerMapper answerMapper;
	@Override
	public void submitAssessQuestionAndAnswer(AnswerRequestDto answerRequestDto) {
		
		answerMapper.update(answerRequestDto.create());
		
	}
	
	
	
}
