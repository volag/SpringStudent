package com.lc.evaluation.dao.basic;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.lc.evaluation.entity.basic.EntityMine;
import com.lc.evaluation.util.PageUtil;

public interface BasicMapper<T extends EntityMine> {
	
	/**
	 * find entity by id.
	 * @param entity
	 * @return
	 */
	T findById(Integer id);
	
	List<T> findByMap(T entity);
	/**
	 * Finding all count from sql
	 * @return
	 */
	long findAllCount();
	
	/**
	 * Finding all result from sql
	 * @return
	 */
	List<T> findAll();
	
	/**
	 * to delete entities, one or more
	 * @param entities
	 */
	void delete(List<Integer> ids);
	
	/**
	 * delete all.
	 */
//	void deleteAll();
	
	/**
	 * update entity data
	 * @param entity
	 */
	void update(T entity);
	
	/**
	 * add entity data
	 * @param entity
	 */
	void add(T entity);
	
	/**
	 * add same entities data
	 * @param entity
	 */
//	@SuppressWarnings("unchecked")
	void addAll(Collection<T> entities);
	
	/**
	 * find entities by page
	 * @param page
	 * @return
	 */
	PageUtil<T> findByPage(int page);

}
