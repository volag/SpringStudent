package com.lc.evaluation.service.basic;

import java.util.List;

import com.lc.evaluation.dto.response.QuestionAndAnswerRespDto;

public interface CanQueryQuestionAndAnswer {
	
	/**
	 * 查询问题和答案
	 * 评教表的主键 assessId
	 * @param assessId
	 * @return
	 */
	List<QuestionAndAnswerRespDto> queryQuestionAndAnswer(Integer assessId);

}
