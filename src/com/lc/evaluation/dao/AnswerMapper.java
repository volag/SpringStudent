package com.lc.evaluation.dao;

import com.lc.evaluation.dao.basic.BasicMapper;
import com.lc.evaluation.entity.Answer;

public interface AnswerMapper extends BasicMapper<Answer>{
	
	String id = "id";
	
	String assessId = "t_assess_id";
	
	String questionId = "t_question_id";
	
	String answer = "answer";
	
}
