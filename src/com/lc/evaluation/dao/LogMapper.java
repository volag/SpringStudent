package com.lc.evaluation.dao;

import java.util.Date;
import java.util.List;

import com.lc.evaluation.dao.basic.BasicMapper;
import com.lc.evaluation.entity.Log;

public interface LogMapper extends BasicMapper<Log>{

	/**
	 * 根据时间区间查询日志，
	 * 1.开始时间不能为空
	 * 2.若结束时间为空的话，那么默认为当前时间
	 * @param startTime 查询开始时间
	 * @param endTime 查询结束时间
	 * @return
	 */
	
	List<Log> findByTimeSection(Date startTime, Date endTime);

}
