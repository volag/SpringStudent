package com.lc.evaluation.dto.response;

public class AdminAssessAllAdviceDto {

	String teacherRealName;
	String teacherUserName;
	String studentRealName;
	String studentUserName;
	String courseName;
	String advice;
	public AdminAssessAllAdviceDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminAssessAllAdviceDto(String teacherRealName, String teacherUserName, String studentRealName,
			String studentUserName, String courseName, String advice) {
		super();
		this.teacherRealName = teacherRealName;
		this.teacherUserName = teacherUserName;
		this.studentRealName = studentRealName;
		this.studentUserName = studentUserName;
		this.courseName = courseName;
		this.advice = advice;
	}
	public String getTeacherRealName() {
		return teacherRealName;
	}
	public void setTeacherRealName(String teacherRealName) {
		this.teacherRealName = teacherRealName;
	}
	public String getTeacherUserName() {
		return teacherUserName;
	}
	public void setTeacherUserName(String teacherUserName) {
		this.teacherUserName = teacherUserName;
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
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	
	
}
