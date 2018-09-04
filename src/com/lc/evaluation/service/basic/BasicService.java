package com.lc.evaluation.service.basic;

import java.util.List;

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
