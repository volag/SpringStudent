package com.lc.evaluation.service.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.lc.evaluation.dao.basic.BasicMapper;
import com.lc.evaluation.dao.basic.BasicUserMapper;
import com.lc.evaluation.dto.basic.BasicRequestUserDto;
import com.lc.evaluation.entity.Core;
import com.lc.evaluation.entity.basic.EntityUser;

//@Component
public abstract class AbstractUserService<T extends EntityUser>
	extends AbstractService<T> implements BasicUserService<T>{
	
	protected BasicUserMapper<T> userMapper;
	
	public AbstractUserService(BasicUserMapper<T> userMapper) {
		super((BasicMapper<T>) userMapper);
		this.userMapper = userMapper;
//		super.basicMapper = (BasicMapper<T>) userMapper;
	}
	
	@Override
	final public boolean isExist(String userName){
		
		if(userMapper.findByUserName(userName) == null)
			return false;
		return true;
		
	}
	
	@Override
	final public boolean modifyPassword(String userName, String oldPassword, String newPassword){
		T entity = userMapper.findByUserName(userName);
		if(entity.getPassword().equals(oldPassword)){
			entity.setPassword(newPassword);
			userMapper.update(entity);
			return true;
		}
		return false;
	}
	
	
	
	@Override
	final public boolean logIn(BasicRequestUserDto<T> user){
		
		T u = userMapper.findByUserName(user.getUserName());
		System.out.println("user :" + u);
		if(u != null && u.getPassword().equals(user.getPassword())){
			return true;
		}
		return false;
	}
	
	@Override
	final public T findByUserName(String userName){
		return userMapper.findByUserName(userName);
	}

}
