package com.lc.evaluation.service;

import java.util.List;

import com.lc.evaluation.dto.response.TeacherAssessDto;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzDto;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzStudentDto;
import com.lc.evaluation.dto.response.TeacherClazzRespDto;
import com.lc.evaluation.dto.response.TeacherCourseClazzStudentDto;
import com.lc.evaluation.dto.response.TeacherCourseRespDto;

public interface TeacherService {

	List<TeacherCourseRespDto> queryCourses(Integer id);

	List<TeacherAssessDto> queryAssess(Integer id);

	List<TeacherClazzRespDto> queryClasses(Integer teacherId, Integer courseId);

	List<TeacherCourseClazzStudentDto> queryCourseClazzStudentAssess(Integer teacherId, Integer courseId,
			Integer clazzId);

	List<TeacherAssessGroupByCourseClazzDto> queryAssessGroupByCourseClazz(Integer teacherId);

	List<TeacherAssessGroupByCourseClazzStudentDto> queryAssessGroupByCourseClazzStudent(Integer teacherId,
			Integer courseId, String clazzId);

}
