package com.lc.evaluation.dto.request;

import java.io.Serializable;

import com.lc.evaluation.dto.basic.BasicRequestUserDto;
import com.lc.evaluation.entity.User;
import com.lc.evaluation.entity.category.UserCategory;

public class UserLoginDto implements BasicRequestUserDto<User>{
	
	String userName;
	
	String password;
	
	UserCategory userType;

	public UserCategory getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = UserCategory.getByName(userType);
	}

	@Override
	public Serializable getId() {
		return null;
	}

	@Override
	public User create() {
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		return user;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
