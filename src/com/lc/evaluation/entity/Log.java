package com.lc.evaluation.entity;

import java.util.Date;

import com.lc.evaluation.entity.basic.EntityMine;

public class Log implements EntityMine{

	private Integer id;
	private Date startTime;
	private Date endTime;
	private String action;
	private String userName;
	private String realName;
	private Integer userType;
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getUserType() {
		return userType;
	}


	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Log [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", action=" + action
				+ ", userName=" + userName + ", realName=" + realName + ", userType=" + userType + "]";
	}



}
