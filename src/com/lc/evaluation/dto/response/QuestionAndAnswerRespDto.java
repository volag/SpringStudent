package com.lc.evaluation.dto.response;

import java.util.Map;

import com.lc.evaluation.dto.basic.BasicResponseMapDto;

public class QuestionAndAnswerRespDto implements BasicResponseMapDto{
	
	Integer answerId;
	
	String questionContext;
	
	String answer;
	
	@Override
	public BasicResponseMapDto init(Map mapData) {
		
		this.answerId = (Integer) mapData.get("id");
		this.questionContext = (String) mapData.get("context");
		this.answer = (String) mapData.get("answer");
		
		return this;
	}

}
