package com.lc.evaluation.service;

import java.util.Date;
import java.util.List;

import com.lc.evaluation.entity.Log;

public interface LogService {
	
	List<Log> queryTodayLogs();
	
	List<Log> query7DayLogs();
	
	List<Log> queryThisMonthLogs();
	
	List<Log> queryByTimeSection(Date startTime, Date endTime);

}
