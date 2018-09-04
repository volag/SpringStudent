package com.lc.evaluation.service.basic;

import com.lc.evaluation.dto.basic.BasicRequestUserDto;
import com.lc.evaluation.entity.basic.EntityUser;

public interface BasicUserService<T  extends EntityUser> extends BasicService<T> {
	
	
	boolean isExist(String userName);
	
	/**
	 * log in success , will return true, else return false
	 * @param user
	 * @return true or false.
	 */
	boolean logIn(BasicRequestUserDto<T> user);
	
	T findByUserName(String userName);

	boolean modifyPassword(String userName, String oldPassword, String newPassword);

}
