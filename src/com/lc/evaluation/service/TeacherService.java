package com.lc.evaluation.service;

import java.util.List;

import com.lc.evaluation.dto.response.TeacherAssessDto;
import com.lc.evaluation.dto.response.TeacherCourseRespDto;

public interface TeacherService {

	List<TeacherCourseRespDto> queryCourses(Integer id);

	List<TeacherAssessDto> queryAssess(Integer id);

}
