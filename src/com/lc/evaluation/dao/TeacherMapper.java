package com.lc.evaluation.dao;

import java.util.List;

import com.lc.evaluation.dao.basic.BasicUserMapper;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzStudentDto;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzDto;
import com.lc.evaluation.entity.Teacher;

public interface TeacherMapper extends BasicUserMapper<Teacher>{
	
	List<TeacherAssessGroupByCourseClazzDto> queryAssessGroupByCourseClazz(Integer teacherId);
	
	List<TeacherAssessGroupByCourseClazzStudentDto> queryAssessGroupByCourseClazzStudent(Integer teacherId, Integer courseId, String clazzId);
	
	List<TeacherAssessGroupByCourseClazzStudentDto> queryAssessGroupByCourseClazzStudentAdvice(Integer teacherId);
	

	
}
