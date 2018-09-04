package com.lc.evaluation.dto.response;

import com.lc.evaluation.entity.AssessTimeSection;
import com.lc.evaluation.util.WorkDate;

public class AssessTimeSectionDto {

	String startTime;
	String endTime;
	
	public static AssessTimeSectionDto newInstance(AssessTimeSection assessTime){
		AssessTimeSectionDto a = new AssessTimeSectionDto();
		a.startTime =WorkDate.dateToString(assessTime.getStartTime());
		a.endTime =WorkDate.dateToString(assessTime.getEndTime());
		return a;
	}
	
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	
	
	
}
