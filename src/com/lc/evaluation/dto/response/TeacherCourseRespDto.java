package com.lc.evaluation.dto.response;

import java.util.Map;

import com.lc.evaluation.dao.CoreMapper;
import com.lc.evaluation.dao.CourseMapper;
import com.lc.evaluation.dto.basic.BasicResponseMapDto;

public class TeacherCourseRespDto implements BasicResponseMapDto{
	
	Integer coreId;
	
	String courseName;
	
	String courseType;
	
	public TeacherCourseRespDto() {
	}
	
	public TeacherCourseRespDto(Integer coreId, String courseName, String courseType) {
		super();
		this.coreId = coreId;
		this.courseName = courseName;
		this.courseType = courseType;
	}


	@Override
	public TeacherCourseRespDto init(Map mapData) {
		
		this.coreId = (Integer) mapData.get(CoreMapper.id);
		this.courseName = (String) mapData.get(CourseMapper.name);
		this.courseType = (String) mapData.get(CourseMapper.type);
		
		return this;
	}
	

	public Integer getCoreId() {
		return coreId;
	}

	public void setCoreId(Integer coreId) {
		this.coreId = coreId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}
	
/*	public StudentCourseRespDto init(Core core, Course course){
		
		this.coreId = core.getId();
		this.courseName = course.getName();
		this.courseType = course.getType();
		
		return this;
	}*/

}
