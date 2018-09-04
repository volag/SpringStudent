package com.lc.evaluation.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lc.evaluation.dao.AssessTimeSectionMapper;
import com.lc.evaluation.dto.response.AssessTimeSectionDto;
import com.lc.evaluation.entity.AssessTimeSection;
import com.lc.evaluation.util.WorkDate;

@Service
public class AssessTimeSectionServiceImpl {

	@Autowired
	AssessTimeSectionMapper assessTimeMapper;

	private AssessTimeSection asssessTimeSetion;
	
	public AssessTimeSectionServiceImpl() {
//		init();
	}

	/**
	 * 设置评教的开始时间
	 * @param time
	 */
	public void setSectionStartTime(Date time) {
		AssessTimeSection ass = new AssessTimeSection();
		asssessTimeSetion.setStartTime(time);
		ass.setStartTime(time);
		assessTimeMapper.update(ass);
	}

	/**
	 * 设置评教的结束时间
	 * @param time
	 */
	public void setSectionEndTime(Date time) {
		AssessTimeSection ass = new AssessTimeSection();
		asssessTimeSetion.setEndTime(time);
		ass.setEndTime(time);
		assessTimeMapper.update(ass);
	}
	
	/**
	 * 
	 * 判断当前时间是否在评教时间之内
	 * @return
	 */
	public boolean canAssess(){
		Date date1 = new Date();
		
		init();
//		getAssessTimeSection();
		if(WorkDate.isBefore(asssessTimeSetion.getStartTime(), date1)
				&&WorkDate.isBefore(date1, asssessTimeSetion.getEndTime())){
			return true;
		}
		return false;
	}

	
	
	/**
	 * 评教时间初始化
	 * @return
	 */
	Object lock = new Object();
	private AssessTimeSection init() {
		synchronized (lock) {
			if (asssessTimeSetion == null) {
				asssessTimeSetion = assessTimeMapper.findAll().get(0);
			}
		}
		return asssessTimeSetion;
	}

	public AssessTimeSectionDto getAssessTimeSection() {
		return AssessTimeSectionDto.newInstance(init());
	}

}
