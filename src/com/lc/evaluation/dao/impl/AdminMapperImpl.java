package com.lc.evaluation.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lc.evaluation.dao.AdminMapper;
import com.lc.evaluation.dao.UserMapper;
import com.lc.evaluation.dto.response.AdminAssessAllAdviceDto;
import com.lc.evaluation.dto.response.AdminAssessAllResultDto;
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.util.PageUtil;

@Repository
public class AdminMapperImpl implements AdminMapper{
	
	@Autowired
	AdminMapper adminMapper;
	@Autowired
	UserMapper userMapper;

	@Override
	public Admin findByUserName(String userName) {
		return adminMapper.findByUserName(userName);
	}

	@Override
	public String findPasswordByUserName(String userName) {
		// TODO Auto-generated method stub
		return adminMapper.findPasswordByUserName(userName);
	}

	@Override
	public Admin findById(Integer id) {
		// TODO Auto-generated method stub
		return adminMapper.findById(id);
	}

	@Override
	public long findAllCount() {
		// TODO Auto-generated method stub
		return adminMapper.findAllCount();
	}

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminMapper.findAll();
	}

	@Override
	public void delete(List<Integer> ids) {
		adminMapper.delete(ids);
	}

	@Override
	public void update(Admin entity) {
		userMapper.update(entity);
		adminMapper.update(entity);
	}

	@Override
	public void add(Admin entity) {
		userMapper.add(entity);
		adminMapper.add(entity);
	}

	@Override
	public void addAll(Collection<Admin> entities) {
		Collection c = entities;
		
		userMapper.addAll(c);
		adminMapper.addAll(entities);
	}

	@Override
	public PageUtil<Admin> findByPage(int page) {
		return null;
	}

	/*
	 *通过map查询管理员 
	 */
	@Override
	public List<Admin> findByMap(Admin entity) {
		return adminMapper.findByMap(entity);
	}
	
	/*
	 * 查询所有的评价结果
	 * 显示每个老师对应课程的总平均分
	 */
	@Override
	public List<AdminAssessAllResultDto> findAssessAllResult(){
		return adminMapper.findAssessAllResult();
	}
	
	/*
	 * 查询所有的评价结果
	 * 显示每个老师对应课程的总平均分
	 */
	@Override
	public List<AdminAssessAllAdviceDto> findAssessAllAdvice(){
		return adminMapper.findAssessAllAdvice();
	}
	
	

}
