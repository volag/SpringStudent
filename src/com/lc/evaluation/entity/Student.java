package com.lc.evaluation.entity;

import java.util.Date;

public class Student extends User{

	private Integer id;
	private Date enterTime;
	private String gradeId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getEnterTime() {
		return enterTime;
	}
	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}
	public String getGradeId() {
		return gradeId;
	}
	public void setGradeId(String gradeId) {
		this.gradeId = gradeId;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", enterTime=" + enterTime + ", gradeId=" + gradeId + "]";
	}
	
	
}
