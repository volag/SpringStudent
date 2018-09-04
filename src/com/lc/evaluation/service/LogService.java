package com.lc.evaluation.service;

import java.util.Date;
import java.util.List;

import com.lc.evaluation.dto.response.LogDto;

public interface LogService {
	
	List<LogDto> queryTodayLogs(Date date);
	
	List<LogDto> query7DayLogs(Date date);
	
	List<LogDto> queryThisMonthLogs(Date date);
	
	List<LogDto> queryByTimeSection(Date startTime, Date endTime);

	List<LogDto> queryAllTime();

}
