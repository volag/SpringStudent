package com.lc.evaluation.service.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lc.evaluation.dao.basic.BasicMapper;
import com.lc.evaluation.entity.basic.EntityMine;
import com.lc.evaluation.util.PageUtil;

public abstract class AbstractService<T extends EntityMine>
implements BasicService<T> {
	
	protected BasicMapper<T> basicMapper;
	
	public AbstractService(BasicMapper<T> basicMapper) {
		super();
		this.basicMapper = basicMapper;
	}

	@Override
	final public void add(T entity) {
		basicMapper.add(entity);
	}

	@Override
	final public void update(T entity) {
//		T entity = dto.create();
		basicMapper.update(entity);
	}
	
	@Override
	final public void delele(List<Integer> ids) {
		basicMapper.delete(ids);
	}
	
	final protected Map genereateTempMap(){
		return new HashMap();
	}
	
	
	@Override
	final public T query(Integer id) {
		return basicMapper.findById(id);
	}

	@Override
	final public List<T> queryAll() {
		return basicMapper.findAll();
	}

	@Override
	final public PageUtil<T> queryPage(Integer page) {
		return basicMapper.findByPage(page);
	}

}
