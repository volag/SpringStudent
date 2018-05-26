package com.lc.evaluation.service;

import java.util.List;

import com.lc.evaluation.dto.basic.BasicResponseMapDto;
import com.lc.evaluation.dto.request.AnswerRequestDto;

public interface StudentService {
	
	/**
	 * 查询该学生所要评价的课程
	 * @param id
	 * @return
	 */
	List<? extends BasicResponseMapDto> queryCourses(Integer id);

	/**
	 * 提交评教的答案
	 * @param answerRequestDdto
	 */
	void submitAssessQuestionAndAnswer(AnswerRequestDto answerRequestDdto);
	
	
}
