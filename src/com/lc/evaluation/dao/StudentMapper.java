package com.lc.evaluation.dao;

import java.util.Map;

import com.lc.evaluation.dao.basic.BasicUserMapper;
import com.lc.evaluation.entity.Student;

public interface StudentMapper extends BasicUserMapper<Student>{
	
	/**
	 * 找到该为学生所有的课程
	 * @param id
	 * @return
	 */
	Map findCourses(Integer id);

}
