package com.lc.evaluation.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.evaluation.dao.LogMapper;
import com.lc.evaluation.dto.response.LogDto;
import com.lc.evaluation.entity.Log;
import com.lc.evaluation.service.LogService;
import com.lc.evaluation.service.basic.AbstractService;
import com.lc.evaluation.util.WorkDate;

@Service
public class LogServiceImpl extends AbstractService<Log>
 		implements LogService{

	
	LogMapper logMapper;
	
	@Autowired
	public LogServiceImpl(LogMapper basicMapper) {
		super(basicMapper);
		logMapper = basicMapper;
	}


	/**
	 * 查询当天的日志信息
	 */
	@Override
	public List<LogDto> queryTodayLogs(Date date) {
		return convert(logMapper.findByTimeSection(WorkDate.getTodayDate(),
				date));
	}
	
	/**
	 * 日志信息格式转换
	 * @param listLog
	 * @return
	 */
	private List<LogDto> convert(List<Log> listLog){
		List<LogDto> listL = new ArrayList<>();
		
		for (Log l : listLog) {
			listL.add(LogDto.newInstance(l));
		}
		return listL;
	}

	/**
	 * 查询七天内的日志信息
	 */
	@Override
	public List<LogDto> query7DayLogs(Date date) {
		return convert(logMapper.findByTimeSection(WorkDate.getBefore7DayDate(),date));
	}
	
	/**
	 * 查询所有的日志信息
	 */
	@Override
	public List<LogDto> queryAllTime(){
		return convert(logMapper.findAll());
	}

	/**
	 * 查询这个月的日志信息
	 */
	@Override
	public List<LogDto> queryThisMonthLogs(Date date) {
		return convert(logMapper.findByTimeSection(WorkDate.getBeginOfThisMonthDate(), date));
	}

	/**
	 * 查询时间段的日志信息
	 */
	@Override
	public List<LogDto> queryByTimeSection(Date startTime, Date endTime) {
		return convert(logMapper.findByTimeSection(startTime, endTime));
	}

}
