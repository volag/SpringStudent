package com.lc.evaluation.dto.basic;

import com.lc.evaluation.entity.basic.EntityUser;

public interface BasicRequestUserDto<T extends EntityUser> extends BasicRequestDto<T>{
	
	String getUserName();
	
	String getPassword();

}
