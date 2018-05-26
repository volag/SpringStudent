package com.lc.evaluation.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lc.evaluation.dao.TeacherMapper;
import com.lc.evaluation.dao.UserMapper;
import com.lc.evaluation.entity.Teacher;
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
	public Teacher findById(Integer id) {
		// TODO Auto-generated method stub
		return teacherMapper.findById(id);
	}

	@Override
	public long findAllCount() {
		// TODO Auto-generated method stub
		return teacherMapper.findAllCount();
	}

	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return teacherMapper.findAll();
	}

	@Override
	public void delete(Collection<Teacher> entities) {
		teacherMapper.delete(entities);
	}

	@Override
	public void update(Teacher entity) {
		userMapper.update(entity);
		teacherMapper.update(entity);
	}

	@Override
	public void add(Teacher entity) {
		userMapper.add(entity);
		teacherMapper.add(entity);
	}

	@Override
	public void addAll(Collection<Teacher> entities) {
		
		Collection c = entities; 
		userMapper.addAll(c);
		teacherMapper.addAll(entities);
	}

	@Override
	public PageUtil<Teacher> findByPage(int page) {
		return null;
	}

	@Override
	public List<Teacher> findByMap(Map maps) {
		// TODO Auto-generated method stub
		return null;
	}

}
