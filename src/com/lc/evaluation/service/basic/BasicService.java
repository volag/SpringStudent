package com.lc.evaluation.service.basic;

import java.io.Serializable;
import java.util.List;

import com.lc.evaluation.dto.basic.BasicRequestDto;
import com.lc.evaluation.dto.basic.BasicResponseDto;
import com.lc.evaluation.entity.basic.EntityMine;
import com.lc.evaluation.util.PageUtil;

public interface BasicService<T extends EntityMine> {

	void add(T dto);

	T query(Integer id);

	List<T> queryAll();

	PageUtil<T> queryPage(Integer page);

	void update(T dto);

	void delele(List<Integer> ids);

}
