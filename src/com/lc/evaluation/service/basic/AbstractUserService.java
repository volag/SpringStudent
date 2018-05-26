package com.lc.evaluation.service.basic;

import org.springframework.stereotype.Component;

import com.lc.evaluation.dao.basic.BasicMapper;
import com.lc.evaluation.dao.basic.BasicUserMapper;
import com.lc.evaluation.dto.basic.BasicRequestUserDto;
import com.lc.evaluation.entity.basic.EntityUser;

@Component
public abstract class AbstractUserService<T extends EntityUser>
	extends AbstractService<T> implements BasicUserService<T>{
	
	protected BasicUserMapper<T> userMapper;
	
	public AbstractUserService(BasicUserMapper<T> userMapper) {
		super((BasicMapper<T>) userMapper);
		this.userMapper = userMapper;
//		super.basicMapper = (BasicMapper<T>) userMapper;
	}
	
	final public boolean isExist(String userName){
		
		if(userMapper.findByUserName(userName) == null)
			return false;
		return true;
		
	}
	
	
	final public boolean logIn(BasicRequestUserDto<T> user){
		
		T u = userMapper.findByUserName(user.getUserName());
		if(u != null && u.getPassword().equals(user.getPassword())){
			return true;
		}
		return false;
	}

}
