package com.lc.evaluation.dto.request;

import java.io.Serializable;

import com.lc.evaluation.dto.basic.BasicRequestDto;
import com.lc.evaluation.entity.Answer;
import com.lc.evaluation.entity.Course;

public class AnswerRequestDto implements BasicRequestDto<Answer>{
	
	private Integer id;
	private Integer assessId;
	
	private Integer questionId;
	private String answer;

	@Override
	public Serializable getId() {
		return id;
	}

	@Override
	public Answer create() {
		Answer entity = new Answer();
		
		entity.setAnswer(answer);
		entity.setId(id);
		entity.setAssessId(assessId);
		entity.setQuestionId(questionId);
		
		return entity;
	}
	
/*
	@Override
	public void validate(Answer entity) {
		//TODO Auto-generated method stub
		
	}
	
	*/

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

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AnswerRequestDto [id=" + id + ", assessId=" + assessId + ", questionId=" + questionId + ", answer="
				+ answer + "]";
	}

	
}
