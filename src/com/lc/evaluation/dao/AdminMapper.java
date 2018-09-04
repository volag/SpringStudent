package com.lc.evaluation.dao;

import java.util.List;

import com.lc.evaluation.dao.basic.BasicUserMapper;
import com.lc.evaluation.dto.response.AdminAssessAllAdviceDto;
import com.lc.evaluation.dto.response.AdminAssessAllResultDto;
import com.lc.evaluation.entity.Admin;

public interface AdminMapper extends BasicUserMapper<Admin>{

	List<AdminAssessAllResultDto> findAssessAllResult();
	
	List<AdminAssessAllAdviceDto> findAssessAllAdvice();

}
