package com.lc.evaluation.dao.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lc.evaluation.dao.StudentMapper;
import com.lc.evaluation.dao.TeacherMapper;
import com.lc.evaluation.dao.UserMapper;
import com.lc.evaluation.entity.Teacher;
import com.lc.evaluation.entity.basic.EntityUser;
import com.lc.evaluation.util.PageUtil;

@Repository
public class TeacherMapperImpl implements TeacherMapper{
	
	@Autowired
	TeacherMapper teacherMapper;
	@Autowired
	UserMapper userMapper;

	@Override
	public Teacher findByUserName(String userName) {
		return teacherMapper.findByUserName(userName);
	}

	@Override
	public String findPasswordByUserName(String userName) {
		// TODO Auto-generated method stub
		return teacherMapper.findPasswordByUserName(userName);
	}

	@Override
	public EntityUser findById(int id) {
		// TODO Auto-generated method stub
		return teacherMapper.findById(id);
	}

	@Override
	public long findAllCount() {
		// TODO Auto-generated method stub
		return teacherMapper.findAllCount();
	}

	@Override
	public List<EntityUser> findAll() {
		// TODO Auto-generated method stub
		return teacherMapper.findAll();
	}

	@Override
	public void delete(Collection<EntityUser> entities) {
		teacherMapper.delete(entities);
	}

	@Override
	public void update(EntityUser entity) {
		userMapper.update(entity);
		teacherMapper.update(entity);
	}

	@Override
	public void add(EntityUser entity) {
		userMapper.add(entity);
		teacherMapper.add(entity);
	}

	@Override
	public void addAll(Collection<EntityUser> entities) {
		userMapper.addAll(entities);
		teacherMapper.addAll(entities);
	}

	@Override
	public PageUtil<EntityUser> findByPage(int page) {
		return null;
	}

}
