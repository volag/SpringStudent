package com.lc.evaluation.dto.response;

import java.util.Map;

import com.lc.evaluation.dto.basic.BasicResponseMapDto;

public class QuestionAndAnswerRespDto implements BasicResponseMapDto{
	
	Integer answerId;
	
	String questionContext;
	
	String answer;
	
	@Override
	public QuestionAndAnswerRespDto init(Map mapData) {
		
		this.answerId = (Integer) mapData.get("id");
		this.questionContext = (String) mapData.get("context");
		this.answer = (String) mapData.get("answer");
		
		return this;
	}

	public Integer getAnswerId() {
		return answerId;
	}

	public void setAnswerId(Integer answerId) {
		this.answerId = answerId;
	}

	public String getQuestionContext() {
		return questionContext;
	}

	public void setQuestionContext(String questionContext) {
		this.questionContext = questionContext;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	
	
}
