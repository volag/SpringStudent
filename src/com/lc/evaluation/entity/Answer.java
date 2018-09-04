package com.lc.evaluation.entity;

import com.lc.evaluation.entity.basic.EntityMine;

public class Answer implements EntityMine{

	private Integer id;
	private Integer assessId;
	private Integer questionId;
	private String answer;
	
	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAssessId() {
		return assessId;
	}

	public void setAssessId(Integer assessId) {
		this.assessId = assessId;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", assessId=" + assessId + ", questionId=" + questionId + "]";
	}
	
	

}
