package com.lc.evaluation.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.evaluation.dao.AnswerMapper;
import com.lc.evaluation.dao.AssessMapper;
import com.lc.evaluation.dao.CourseMapper;
import com.lc.evaluation.dao.QuestionMapper;
import com.lc.evaluation.dao.impl.AdminMapperImpl;
import com.lc.evaluation.dao.impl.TeacherMapperImpl;
import com.lc.evaluation.dto.response.AdminAssessAllAdviceDto;
import com.lc.evaluation.dto.response.AdminAssessAllResultDto;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzStudentDto;
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.entity.Answer;
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
	
	/**
	 * 通过评教id查询评教结果信息
	 * 学生对老师的评教详情
	 */
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
			listDto.add(dto);
		}
		
		return listDto;
	}
	
	@Autowired
	AssessMapper assessMapper;

	/**
	 * 
	 * 通过评教id查询学生意见信息
	 * 
	 */
	@Override
	public String queryAssessAdvice(Integer assessId) {
		return assessMapper.findById(assessId).getAdvice();
	}
	
	/**
	 * 查询所有老师的评价结果
	 * 即评教总结果
	 * 
	 */
	@Override
	public List<AdminAssessAllResultDto> queryAssessAllResult(){
		return adminMapper.findAssessAllResult();
	}
	
	/**
	 * 
	 * 查询所有学生对老师的意见信息
	 *
	 */
	@Override
	public List<AdminAssessAllAdviceDto> queryAssessAllAdvice(){
		return adminMapper.findAssessAllAdvice();
	}
	
	@Autowired
	TeacherServiceImpl teacherServiceImpl;
	
	/**
	 * 
	 * 查询老师对应课程班级的评教情况
	 * 
	 */
	@Override
	public List<TeacherAssessGroupByCourseClazzStudentDto> 
		queryAssessGroupByCourseClazzStudent(Integer teacherId,
			Integer courseId, String clazzId){
		return teacherServiceImpl.queryAssessGroupByCourseClazzStudent(teacherId, courseId, clazzId);
	}
	
}
