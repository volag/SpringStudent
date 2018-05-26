package com.lc.evaluation.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lc.evaluation.dao.AdminMapper;
import com.lc.evaluation.dao.UserMapper;
import com.lc.evaluation.entity.Admin;
import com.lc.evaluation.entity.basic.EntityUser;
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
	public EntityUser findById(int id) {
		// TODO Auto-generated method stub
		return adminMapper.findById(id);
	}

	@Override
	public long findAllCount() {
		// TODO Auto-generated method stub
		return adminMapper.findAllCount();
	}

	@Override
	public List<EntityUser> findAll() {
		// TODO Auto-generated method stub
		return adminMapper.findAll();
	}

	@Override
	public void delete(Collection<EntityUser> entities) {
		adminMapper.delete(entities);
	}

	@Override
	public void update(EntityUser entity) {
		userMapper.update(entity);
		adminMapper.update(entity);
	}

	@Override
	public void add(EntityUser entity) {
		userMapper.add(entity);
		adminMapper.add(entity);
	}

	@Override
	public void addAll(Collection<EntityUser> entities) {
		userMapper.addAll(entities);
		adminMapper.addAll(entities);
	}

	@Override
	public PageUtil<EntityUser> findByPage(int page) {
		return null;
	}

}
