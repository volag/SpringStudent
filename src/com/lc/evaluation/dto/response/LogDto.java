package com.lc.evaluation.dto.response;

import com.lc.evaluation.entity.Log;
import com.lc.evaluation.util.WorkDate;

public class LogDto {

	private Integer id;
	private String startTime;
	private String endTime;
	private String action;
	private String userName;
	private String realName;
	private String userType;
	private Boolean isSuccess;
	
	public static LogDto newInstance(Log log){
		LogDto logDto = new LogDto();
		logDto.setAction(log.getAction());
		logDto.setEndTime(WorkDate.dateTimeToString(log.getEndTime()));
		logDto.setStartTime(WorkDate.dateTimeToString(log.getStartTime()));
		
		logDto.id = log.getId();
		logDto.isSuccess = log.getIsSuccess();
		logDto.realName = log.getRealName();
		logDto.userType = convertUserType(log.getUserType());
		logDto.userName = log.getUserName();
		
		return logDto;
	}
	
	private static String convertUserType(Integer userType){
		switch(userType==null?-1:userType){
		case 0:
			return "学生";
		case 1:
			return "老师";
		case 2:
			return "管理员";
		case -1:
			return "不确定";
		}
		return null;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	
	
	
	
}
