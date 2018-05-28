package com.lc.evaluation.dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.lc.evaluation.dao.basic.BasicUserMapper;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzStudentDto;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.entity.basic.EntityUser;
import com.lc.evaluation.util.PageUtil;

public interface StudentMapper extends BasicUserMapper<Student>{

	/**
	 * student id
	 * @param id
	 * @return
	 */
	
	
//	Map findCourses(Integer id);
//	
//	Map findQuestionsAndAnswers(Integer assessId);
	
}
