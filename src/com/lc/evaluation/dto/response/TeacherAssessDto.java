package com.lc.evaluation.dto.response;

public class TeacherAssessDto {
	
	String stuNo;
	
	String stuRealName;
	
	String courseNo;
	
	String courseName;
	
	String advice;
	
	Float score;
	
	public TeacherAssessDto() {
		// TODO Auto-generated constructor stub
	}

	public TeacherAssessDto(String stuNo, String stuRealName, 
			String courseNo, String courseName, String advice,
			Float score) {
		super();
		this.stuNo = stuNo;
		this.stuRealName = stuRealName;
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.advice = advice;
		this.score = score;
	}

}
