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
import com.lc.evaluation.dao.impl.StudentMapperImpl;
import com.lc.evaluation.dto.basic.BasicResponseDto;
import com.lc.evaluation.dto.request.AnswerRequestDto;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.dto.response.StudentCourseRespDto;
import com.lc.evaluation.entity.Answer;
import com.lc.evaluation.entity.Core;
import com.lc.evaluation.entity.Course;
import com.lc.evaluation.entity.Question;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.service.StudentService;
import com.lc.evaluation.service.basic.AbstractUserService;
import com.lc.evaluation.service.basic.CanQueryQuestionAndAnswer;

public class StudentServiceImpl 
	extends AbstractUserService<Student> 
	implements StudentService,
	CanQueryQuestionAndAnswer{
	
	private StudentMapperImpl studentMapper;
	
	@Autowired
	private CoreMapper coreMapper;
	
	@Autowired
	public StudentServiceImpl(StudentMapperImpl userMapper) {
		super(userMapper);
		this.studentMapper = userMapper;
	}

	@Override
	public BasicResponseDto<Student> query(Serializable id) {
		// TODO Auto-generated method stub
//		return studentMapper.findById(id);
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
		
	}
	
	@Autowired
	CourseMapper courseMapper;

	@Override
	public List<StudentCourseRespDto> queryCourses(Integer id) {
		
		List<StudentCourseRespDto> listDto = 
				new ArrayList<>(); 
		
		Map map = genereateTempMap();
		map.put(CoreMapper.studentId, id);
		List<Core> cores = coreMapper.findByMap(map);
		for (Core core : cores) {
			Course course = courseMapper.findById(core.getCourseId());
			
			listDto.add(new StudentCourseRespDto(core.getId(),
					course.getName() , course.getType()));
		}
		return listDto;
	}

	@Autowired
	AnswerMapper answerMapper;
	@Autowired
	QuestionMapper questionMapper;
	
	
	@Override
	public void submitAssessQuestionAndAnswer(AnswerRequestDto answerRequestDto) {
		answerMapper.update(answerRequestDto.create());
	}
	
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
