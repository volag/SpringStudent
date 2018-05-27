package com.lc.evaluation.service;

import java.util.List;

import com.lc.evaluation.dto.basic.BasicResponseMapDto;
import com.lc.evaluation.dto.request.AnswerRequestDto;
import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;

public interface StudentService {
	
	/**
	 * 查询该学生所要评价的课程
	 * @param id
	 * @return
	 */
	List<? extends BasicResponseMapDto> queryCourses(Integer id);

	
	List<? extends BasicResponseMapDto> queryCoursesByType(Integer id, String courseType);
	/**
	 * 提交评教的答案
	 * @param answerRequestDdto
	 */
	void submitAssessQuestionAndAnswer(List<Integer> answerIds, List<String> answers);
	
	boolean isAssess(Integer studentId);

	void submitAdviceAndCore(Integer assessId, List<String> answers, String advice);
	
}
