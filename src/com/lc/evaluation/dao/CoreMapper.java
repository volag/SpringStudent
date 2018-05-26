package com.lc.evaluation.dao;

import com.lc.evaluation.dao.basic.BasicMapper;
import com.lc.evaluation.entity.Core;

public interface CoreMapper extends BasicMapper<Core>{
	
	 String id = "id";
	 String studentId = "t_student_id";
	 String courseId = "t_course_id";
	 String teacherId = "t_teacher_id";

}
