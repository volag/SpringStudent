package com.lc.evaluation.dto.response;

public class AdminAssessAllResultDto {

	String teacherRealName;
	String teacherUserName;
	Integer teacherId;
	Integer courseId;
	String courseNo;
	String courseName;
	String clazzId;
	Float avarage;
	
	
	public AdminAssessAllResultDto() {
		// TODO Auto-generated constructor stub
	}
	
	



	public AdminAssessAllResultDto(String teacherRealName, String teacherUserName, Integer teacherId, Integer courseId,
			String courseNo, String courseName, String clazzId, Float avarage) {
		super();
		this.teacherRealName = teacherRealName;
		this.teacherUserName = teacherUserName;
		this.teacherId = teacherId;
		this.courseId = courseId;
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.clazzId = clazzId;
		this.avarage = avarage;
	}







	public String getCourseNo() {
		return courseNo;
	}





	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
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
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getClazzId() {
		return clazzId;
	}
	public void setClazzId(String clazzId) {
		this.clazzId = clazzId;
	}
	public Float getAvarage() {
		return avarage;
	}
	public void setAvarage(Float avarage) {
		this.avarage = avarage;
	}
	
	
}
