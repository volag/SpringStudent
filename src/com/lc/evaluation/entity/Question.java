package com.lc.evaluation.entity;

import com.lc.evaluation.entity.basic.EntityMine;

public class Question implements EntityMine{

	private Integer id;
	private String context;
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", context=" + context + "]";
	}
	
	

}
