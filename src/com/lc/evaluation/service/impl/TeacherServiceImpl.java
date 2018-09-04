package com.lc.evaluation.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.evaluation.dao.AssessMapper;
import com.lc.evaluation.dao.CoreMapper;
import com.lc.evaluation.dao.CourseMapper;
import com.lc.evaluation.dao.impl.StudentMapperImpl;
import com.lc.evaluation.dao.impl.TeacherMapperImpl;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;
import com.lc.evaluation.dto.response.TeacherAssessDto;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzDto;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzStudentDto;
import com.lc.evaluation.dto.response.TeacherClazzRespDto;
import com.lc.evaluation.dto.response.TeacherCourseClazzStudentDto;
import com.lc.evaluation.dto.response.TeacherCourseRespDto;
import com.lc.evaluation.entity.Assess;
import com.lc.evaluation.entity.Core;
import com.lc.evaluation.entity.Course;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.service.TeacherService;
import com.lc.evaluation.service.basic.AbstractUserService;

@Service
public class TeacherServiceImpl extends AbstractUserService<Teacher>
		implements TeacherService {

	private TeacherMapperImpl teacherMapper;

	@Autowired
	private CoreMapper coreMapper;

	@Autowired
	public TeacherServiceImpl(TeacherMapperImpl userMapper) {
		super(userMapper);
		this.teacherMapper = userMapper;
	}

	@Autowired
	CourseMapper courseMapper;

	@Override
	public List<TeacherCourseRespDto> queryCourses(Integer id) {

		List<TeacherCourseRespDto> listDto = new ArrayList<>();
		Core co  =new Core();
		co.setTeacherId(id);
		List<Core> cores = coreMapper.findByMap(co);
		for (Core core : cores) {
			Course course = courseMapper.findById(core.getCourseId());
			listDto.add(new TeacherCourseRespDto(core.getId(), course.getName(), course.getType()));
		}
		return listDto;
	}

	@Autowired
	AssessMapper assessMapper;

	@Autowired
	StudentMapperImpl studentMapperImpl;

	/**
	 * 查询评教信息
	 */
	@Override
	public List<TeacherAssessDto> queryAssess(Integer teacherId) {

		List<TeacherAssessDto> listDto = new ArrayList<>();

		Core co = new Core();
		co.setTeacherId(teacherId);
		List<Core> cores = coreMapper.findByMap(co);
		for (Core core : cores) {
			Assess assess = assessMapper.findById(core.getId());
			Student stu = studentMapperImpl.findById(core.getStudentId());
			Course course = courseMapper.findById(core.getCourseId());

			listDto.add(new TeacherAssessDto(
					stu.getUserName(),
					stu.getRealName(),
					course.getNo(),
					course.getName(),
					assess.getAdvice(),
					assess.getScore()));
		}
		return listDto;
	}
	
	@Override
	public List<TeacherAssessGroupByCourseClazzDto> queryAssessGroupByCourseClazz(Integer teacherId) {
		return teacherMapper.queryAssessGroupByCourseClazz(teacherId);
	}
	
	@Override
	public List<TeacherAssessGroupByCourseClazzStudentDto> 
		queryAssessGroupByCourseClazzStudent(Integer teacherId,
			Integer courseId, String clazzId) {
		
		if(courseId != null)
			return teacherMapper.queryAssessGroupByCourseClazzStudent(
					teacherId, courseId, clazzId);
		return teacherMapper
				.queryAssessGroupByCourseClazzStudentAdvice(teacherId);
	}
	
	@Override
	public List<TeacherClazzRespDto> queryClasses(Integer teacherId, Integer courseId){
		List<TeacherClazzRespDto> classDtos = new ArrayList<>();
		
		Core co = new Core();
		co.setTeacherId(teacherId);
		co.setCourseId(courseId);
		List<Core> cores = coreMapper.findByMap(co);
		Set<String> stuGradeIds = new HashSet<>();
		for (Core core : cores) {
			Student stu = studentMapperImpl.findById(core.getStudentId());
			stuGradeIds.add(stu.getGradeId());
		}
		
		for (String string : stuGradeIds) {
			classDtos.add(new TeacherClazzRespDto(string));
		}
		return classDtos;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public List<TeacherCourseClazzStudentDto> 
		queryCourseClazzStudentAssess(Integer teacherId, Integer courseId,
				Integer clazzId){
		
		List<TeacherCourseClazzStudentDto> list = 
				new ArrayList<>();
		
		List<Core> cores = coreMapper.findByMap(
				new Core(null, null , courseId, teacherId));
		
		for(Core c: cores){
			Student stu = studentMapperImpl.findById(c.getStudentId());
			if(! stu.getGradeId().equals(clazzId))
				continue;
			Assess a = assessMapper.findById(c.getId());
			list.add(
					new TeacherCourseClazzStudentDto(a.getScore(), a.getAdvice()));
		}
		return list;
	}
	
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@Override
	public List<QuestionAndAnswerRespDto> queryQuestionAndAnswer(Integer assessId){
		return studentServiceImpl.queryQuestionAndAnswer(assessId);
	}
	
	
	
}
