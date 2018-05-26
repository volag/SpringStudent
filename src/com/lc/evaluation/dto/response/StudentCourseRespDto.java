package com.lc.evaluation.dto.response;

import java.util.Map;

import com.lc.evaluation.dto.basic.BasicResponseMapDto;

public class StudentCourseRespDto implements BasicResponseMapDto{
	
	Integer coreId;
	
	String courseName;
	
	String courseType;
	
	@Override
	public StudentCourseRespDto init(Map mapData) {
		
		this.coreId = (Integer) mapData.get("id");
		this.courseName = (String) mapData.get("name");
		this.courseType = (String) mapData.get("type");
		
		return this;
	}
	
	

}
