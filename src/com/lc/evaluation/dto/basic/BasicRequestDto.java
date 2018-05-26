package com.lc.evaluation.dto.basic;

import java.io.Serializable;

import com.lc.evaluation.entity.basic.EntityMine;

public interface BasicRequestDto<T extends EntityMine> {
	
	Serializable getId();

	/**
	 * create entity by using this object data.
	 * @return
	 */
	T create();
	
/*	*//**
	 * update data , put in an old entity, 
	 * return a new entity by using this object data.
	 * @param oldEntity
	 * @return
	 *//*
	T update(T oldEntity);*/
	
	
/*	*//**
	 * Checking the input data whether is 
	 * @param entity
	 *//*
	void validate(T entity);
	*/
}
