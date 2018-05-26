package com.lc.evaluation.dto.basic;

import com.lc.evaluation.entity.basic.EntityMine;

public interface BasicResponseDto<T extends EntityMine> {
	
	BasicResponseDto<T> init(T entity);

}
