package com.lc.evaluation.service.basic;

import java.io.Serializable;
import java.util.List;

import com.lc.evaluation.dto.basic.BasicRequestDto;
import com.lc.evaluation.dto.basic.BasicResponseDto;
import com.lc.evaluation.entity.basic.EntityMine;

public interface BasicService<T extends EntityMine> {

	<DTO extends BasicRequestDto<T>> void add(DTO dto);

	BasicResponseDto<T> query(Serializable id);

	List<BasicResponseDto<T>> queryAll();

	List<BasicResponseDto<T>> queryPage(int page);

	<DTO extends BasicRequestDto<T>> void update(DTO dto);

	void delele(Serializable... ids);

}
