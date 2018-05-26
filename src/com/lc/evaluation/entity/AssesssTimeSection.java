package com.lc.evaluation.entity;

import java.util.Date;

import com.lc.evaluation.entity.basic.EntityMine;

/**
 * 评教时间区间
 * @author 0001
 *
 */
public class AssesssTimeSection implements EntityMine{

	private Integer id;
	private Date startTime; 
	private Date endTime;
	
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "AssesssTimeSection [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	

}
