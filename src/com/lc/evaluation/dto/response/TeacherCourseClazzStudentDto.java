package com.lc.evaluation.dto.response;

public class TeacherCourseClazzStudentDto {

	Float core;
	
	String advices;
	
	public TeacherCourseClazzStudentDto() {
		// TODO Auto-generated constructor stub
	}
	
	public TeacherCourseClazzStudentDto(Float core, String advices) {
		super();
		this.core = core;
		this.advices = advices;
	}



	public Float getCore() {
		return core;
	}

	public void setCore(Float core) {
		this.core = core;
	}

	public String getAdvices() {
		return advices;
	}

	public void setAdvices(String advices) {
		this.advices = advices;
	}
	
	
	
}
