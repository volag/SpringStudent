package com.lc.evaluation.dto.response;

public class TeacherAssessGroupByCourseClazzDto {
	
	String clazzId;
	
	String courseNo;
	
	String courseId;
	
	String courseName;
	
	Float scoreAverage;
	
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public TeacherAssessGroupByCourseClazzDto() {
		
	}

	public TeacherAssessGroupByCourseClazzDto(String clazzId, String courseNo, String courseName, Float scoreAverage) {
		super();
		this.clazzId = clazzId;
		this.courseNo = courseNo;
		this.courseName = courseName;
		this.scoreAverage = scoreAverage;
	}

	public String getClazzId() {
		return clazzId;
	}

	public void setClazzId(String clazzId) {
		this.clazzId = clazzId;
	}

	public String getCourseNo() {
		return courseNo;
	}

	public void setCourseNo(String courseNo) {
		this.courseNo = courseNo;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Float getScoreAverage() {
		return scoreAverage;
	}

	public void setScoreAverage(Float scoreAverage) {
		this.scoreAverage = scoreAverage;
	}

	@Override
	public String toString() {
		return "TeacherAssessGroupByCourseClazzDto [clazzId=" + clazzId + ", courseNo=" + courseNo + ", courseId="
				+ courseId + ", courseName=" + courseName + ", scoreAverage=" + scoreAverage + "]";
	}
	
	
}
