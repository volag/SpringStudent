package com.lc.evaluation.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.lc.evaluation.dao.AssessMapper;
import com.lc.evaluation.dao.CoreMapper;
import com.lc.evaluation.dao.CourseMapper;
import com.lc.evaluation.dao.impl.StudentMapperImpl;
import com.lc.evaluation.dao.impl.TeacherMapperImpl;
import com.lc.evaluation.dto.basic.BasicResponseDto;
import com.lc.evaluation.dto.response.TeacherAssessDto;
import com.lc.evaluation.dto.response.TeacherCourseRespDto;
import com.lc.evaluation.entity.Assess;
import com.lc.evaluation.entity.Core;
import com.lc.evaluation.entity.Course;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.service.TeacherService;
import com.lc.evaluation.service.basic.AbstractUserService;

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

	@Override
	public BasicResponseDto<Teacher> query(Serializable id) {
		// TODO Auto-generated method stub
		// return studentMapper.findById(id);
		return null;
	}

	@Override
	public List<BasicResponseDto<Teacher>> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BasicResponseDto<Teacher>> queryPage(int page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	CourseMapper courseMapper;

	@Override
	public List<TeacherCourseRespDto> queryCourses(Integer id) {

		List<TeacherCourseRespDto> listDto = new ArrayList<>();
		Map map = genereateTempMap();
		map.put(CoreMapper.teacherId, id);
		List<Core> cores = coreMapper.findByMap(map);
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

	@Override
	public List<TeacherAssessDto> queryAssess(Integer id) {

		List<TeacherAssessDto> listDto = new ArrayList<>();
		Map map = genereateTempMap();
		map.put(CoreMapper.teacherId, id);

		List<Core> cores = coreMapper.findByMap(map);
		for (Core core : cores) {
			
			Assess assess = assessMapper.findById(core.getId());
			Student stu = studentMapperImpl.findById(core.getStudentId());
			Course course = courseMapper.findById(core.getCourseId());

			listDto.add(new TeacherAssessDto(stu.getUserName(), stu.getRealName(), course.getNo(), course.getName(),
					assess.getAdvice(), assess.getScore()));
			
		}
		return listDto;

	}

}
