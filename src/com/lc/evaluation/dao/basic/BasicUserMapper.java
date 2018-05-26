package com.lc.evaluation.dao.basic;

import com.lc.evaluation.entity.basic.EntityUser;

public interface BasicUserMapper<T extends EntityUser> 
	extends BasicMapper<EntityUser>{
	
	/**
	 * find entity by user name;
	 * @param userName userName.
	 * @return
	 */
	T findByUserName(String userName);

	String findPasswordByUserName(String userName);
	
	
}
