package com.lc.evaluation.dto.response;

public class TeacherAssessGroupByCourseClazzStudentDto {
	
	String studentRealName;
	
	String studentUserName;
	
	String assessCore;
	
	Integer coreId;
	
	String advice;
	
	public String getAdvice() {
		return advice;
	}


	public void setAdvice(String advice) {
		this.advice = advice;
	}


	public Integer getCoreId() {
		return coreId;
	}


	public void setCoreId(Integer coreId) {
		this.coreId = coreId;
	}


	public TeacherAssessGroupByCourseClazzStudentDto() {
		// TODO Auto-generated constructor stub
	}


	public TeacherAssessGroupByCourseClazzStudentDto(String studentRealName, String studentUserName, String assessCore) {
		super();
		this.studentRealName = studentRealName;
		this.studentUserName = studentUserName;
		this.assessCore = assessCore;
	}


	public String getStudentRealName() {
		return studentRealName;
	}


	public void setStudentRealName(String studentRealName) {
		this.studentRealName = studentRealName;
	}


	public String getStudentUserName() {
		return studentUserName;
	}


	public void setStudentUserName(String studentUserName) {
		this.studentUserName = studentUserName;
	}


	public String getAssessCore() {
		return assessCore;
	}


	public void setAssessCore(String assessCore) {
		this.assessCore = assessCore;
	}
	
}
