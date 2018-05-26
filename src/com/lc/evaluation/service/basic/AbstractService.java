package com.lc.evaluation.service.basic;

import java.util.HashMap;
import java.util.Map;

import com.lc.evaluation.dao.basic.BasicMapper;
import com.lc.evaluation.dto.basic.BasicRequestDto;
import com.lc.evaluation.entity.basic.EntityMine;

public abstract class AbstractService<T extends EntityMine> implements BasicService<T> {
	
	protected BasicMapper<T> basicMapper;
	
	public AbstractService(BasicMapper<T> basicMapper) {
		super();
		this.basicMapper = basicMapper;
	}

	@Override
	public <DTO extends BasicRequestDto<T>> void add(DTO dto) {
		basicMapper.add(dto.create());
	}

	@Override
	public <DTO extends BasicRequestDto<T>> void update(DTO dto) {
		T entity = dto.create();
		basicMapper.update(entity);
	}
	
	final protected Map genereateTempMap(){
		return new HashMap();
	}

}
