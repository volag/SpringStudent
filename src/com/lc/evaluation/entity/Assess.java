package com.lc.evaluation.entity;

import com.lc.evaluation.entity.basic.EntityMine;

public class Assess implements EntityMine{

	private Integer id;
	private Float score;
	private String advice;
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Float getScore() {
		return score;
	}

	public void setScore(Float score) {
		this.score = score;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	@Override
	public String toString() {
		return "Assess [id=" + id + ", score=" + score + ", advice=" + advice + "]";
	}
	
	

}
