package com.lc.evaluation.service;

import java.util.List;

import com.lc.evaluation.dto.response.AdminAssessAllAdviceDto;
import com.lc.evaluation.dto.response.AdminAssessAllResultDto;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzStudentDto;

public interface AdminService {

	/**
	 * 查询所有老师的评价结果
	 * @return
	 */
	List<AdminAssessAllResultDto> queryAssessAllResult();

	/**
	 * 查询学生对老师的评价结果
	 * @param teacherId
	 * @param courseId
	 * @param clazzId
	 * @return
	 */
	List<TeacherAssessGroupByCourseClazzStudentDto> queryAssessGroupByCourseClazzStudent(Integer teacherId,
			Integer courseId, String clazzId);

	/**
	 * 查询所有的意见信息
	 * @return
	 */
	List<AdminAssessAllAdviceDto> queryAssessAllAdvice();


}
