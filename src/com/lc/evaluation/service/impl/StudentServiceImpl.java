package com.lc.evaluation.service.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.evaluation.dao.AnswerMapper;
import com.lc.evaluation.dao.AssessMapper;
import com.lc.evaluation.dao.CoreMapper;
import com.lc.evaluation.dao.CourseMapper;
import com.lc.evaluation.dao.QuestionMapper;
import com.lc.evaluation.dao.impl.StudentMapperImpl;
import com.lc.evaluation.dao.impl.TeacherMapperImpl;
import com.lc.evaluation.dto.request.AnswerRequestDto;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.dto.response.StudentCourseRespDto;
import com.lc.evaluation.entity.Answer;
import com.lc.evaluation.entity.Assess;
import com.lc.evaluation.entity.Core;
import com.lc.evaluation.entity.Course;
import com.lc.evaluation.entity.Question;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.service.StudentService;
import com.lc.evaluation.service.basic.AbstractUserService;
import com.lc.evaluation.service.basic.CanQueryQuestionAndAnswer;
import com.lc.evaluation.util.AnswerCoreUtil;

@Service
public class StudentServiceImpl extends AbstractUserService<Student>
		implements StudentService, CanQueryQuestionAndAnswer {

	private StudentMapperImpl studentMapper;

	@Autowired
	private CoreMapper coreMapper;

	@Autowired
	public StudentServiceImpl(StudentMapperImpl userMapper) {
		super(userMapper);
		this.studentMapper = userMapper;
	}

	@Autowired
	CourseMapper courseMapper;

	@Autowired
	TeacherMapperImpl teacherMapper;

	@Override
	public List<StudentCourseRespDto> queryCourses(Integer id) {

		return queryCoursesByType(id, null);
	}

	@Override
	public List<StudentCourseRespDto> queryCoursesByType(Integer id, String courseType) {

		List<StudentCourseRespDto> listDto = new LinkedList<>();
		Core co = new Core();
		co.setStudentId(id);
		List<Core> cores = coreMapper.findByMap(co);
//		System.out.println("cores : " + cores.size());
		for (Core core : cores) {
			Course course = courseMapper.findById(core.getCourseId());
			Teacher tea = teacherMapper.findById(core.getTeacherId());
			listDto.add(new StudentCourseRespDto(core.getId(), course.getName(), course.getType(), tea.getRealName()));
		}
		if (courseType != null) {
			for (StudentCourseRespDto t : listDto) {
				if (!t.getCourseType().equals(courseType)) {
					listDto.remove(t);
				}
			}
		}
		return listDto;
	}

	@Autowired
	AnswerMapper answerMapper;
	@Autowired
	QuestionMapper questionMapper;

	@Override
	public void submitAssessQuestionAndAnswer(List<Integer> answerIds, List<String> answers) {

		List<AnswerRequestDto> listAnswers = new ArrayList<>();
		
		int sum = 0;
		for (int i = 0; i < answerIds.size(); i++) {
			AnswerRequestDto a = new AnswerRequestDto();
			a.setId(answerIds.get(i));
			a.setAnswer(answers.get(i));
			listAnswers.add(a);
			System.out.println(a);
		}

		for (AnswerRequestDto answer : listAnswers) {
			answerMapper.update(answer.create());
		}

	}
	
	
	@Autowired
	AssessMapper assessMapper;
	
	
	@Override
	public void submitAdviceAndCore(Integer assessId ,List<String> answers, String advice){
		
		float sumCore = AnswerCoreUtil.getCore(answers);
		
		Assess assess = new Assess();
		assess.setId(assessId);
		assess.setAdvice(advice);
		assess.setScore(sumCore);
System.out.println(assess);
		assessMapper.update(assess);
	}
	
	@Autowired
	AdminServiceImpl adminServiceImpl;

	@Override
	public List<QuestionAndAnswerRespDto> queryQuestionAndAnswer(Integer assessId) {
		return adminServiceImpl.queryQuestionAndAnswer(assessId);
	}
	
	
	@Override
	public boolean isAssess(Integer studentId) {
		Student stu = studentMapper.findById(studentId);
		if (stu.getIsAssess() == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String queryAssessAdvice(Integer assessId) {
		return adminServiceImpl.queryAssessAdvice(assessId);
	}

}
