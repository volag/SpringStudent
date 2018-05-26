package com.lc.evaluation.entity;

import com.lc.evaluation.entity.basic.EntityMine;

public class Core implements EntityMine{

	private Integer id;
	private Integer studentId;
	private Integer courseId;
	private Integer teacherId;
	
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Integer getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
	}

	@Override
	public String toString() {
		return "Core [id=" + id + ", studentId=" + studentId + ", courseId=" + courseId + ", teacherId=" + teacherId
				+ "]";
	}

	
	
}
