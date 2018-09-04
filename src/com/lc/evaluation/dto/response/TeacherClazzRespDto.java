package com.lc.evaluation.dto.response;

public class TeacherClazzRespDto {
	
	String clazzId;
	
	public TeacherClazzRespDto() {
	}

	public TeacherClazzRespDto(String gradeId) {
		super();
		this.clazzId = gradeId;
	}

	public String getClazzId() {
		return clazzId;
	}

	public void setClazzId(String clazzId) {
		this.clazzId = clazzId;
	}

	
	
}
