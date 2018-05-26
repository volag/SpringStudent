package com.lc.evaluation.service;

import com.lc.evaluation.dto.basic.BasicResponseMapDto;
import com.lc.evaluation.dto.request.AnswerRequestDto;

public interface StudentService {
	
	BasicResponseMapDto queryCourses(Integer id);

	void submitAssessQuestionAndAnswer(AnswerRequestDto answerRequestDdto);
	
	
}
