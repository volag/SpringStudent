package com.lc.evaluation.service.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lc.evaluation.dao.LogMapper;
import com.lc.evaluation.dto.basic.BasicResponseDto;
import com.lc.evaluation.entity.Log;
import com.lc.evaluation.service.LogService;
import com.lc.evaluation.service.basic.AbstractService;
import com.lc.evaluation.util.WorkDate;

public class LogServiceImpl extends AbstractService<Log>
 		implements LogService{

	
	LogMapper logMapper;
	
	@Autowired
	public LogServiceImpl(LogMapper basicMapper) {
		super(basicMapper);
	}

	@Override
	public BasicResponseDto<Log> query(Serializable id) {
		return null;
	}

	@Override
	public List<BasicResponseDto<Log>> queryAll() {
		return null;
	}

	@Override
	public List<BasicResponseDto<Log>> queryPage(int page) {
		return null;
	}

	@Override
	public List<Log> queryTodayLogs() {
		return logMapper.findByTimeSection(WorkDate.getTodayDate(),
				null);
	}

	@Override
	public List<Log> query7DayLogs() {
		return logMapper.findByTimeSection(WorkDate.getBefore7DayDate(),null);
	}

	@Override
	public List<Log> queryThisMonthLogs() {
		return logMapper.findByTimeSection(WorkDate.getBeginOfThisMonthDate(), null);
	}

	@Override
	public List<Log> queryByTimeSection(Date startTime, Date endTime) {
		return logMapper.findByTimeSection(startTime, endTime);
	}

}
