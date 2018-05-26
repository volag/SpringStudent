package com.lc.evaluation.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lc.evaluation.dao.StudentMapper;
import com.lc.evaluation.dao.UserMapper;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.entity.basic.EntityUser;
import com.lc.evaluation.util.PageUtil;

@Repository
public class StudentMapperImpl implements StudentMapper{
	
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	UserMapper userMapper;

	@Override
	public Student findByUserName(String userName) {
		return studentMapper.findByUserName(userName);
	}

	@Override
	public String findPasswordByUserName(String userName) {
		// TODO Auto-generated method stub
		return studentMapper.findPasswordByUserName(userName);
	}

	@Override
	public EntityUser findById(int id) {
		// TODO Auto-generated method stub
		return studentMapper.findById(id);
	}

	@Override
	public long findAllCount() {
		// TODO Auto-generated method stub
		return studentMapper.findAllCount();
	}

	@Override
	public List<EntityUser> findAll() {
		// TODO Auto-generated method stub
		return studentMapper.findAll();
	}

	@Override
	public void delete(Collection<EntityUser> entities) {
		studentMapper.delete(entities);
	}

	@Override
	public void update(EntityUser entity) {
		userMapper.update(entity);
		studentMapper.update(entity);
	}

	@Override
	public void add(EntityUser entity) {
		userMapper.add(entity);
		studentMapper.add(entity);
	}

	@Override
	public void addAll(Collection<EntityUser> entities) {
		userMapper.addAll(entities);
		studentMapper.addAll(entities);
	}

	@Override
	public PageUtil<EntityUser> findByPage(int page) {
		return null;
	}

	@Override
	public Map findCourses(Integer id) {
		return studentMapper.findCourses(id);
	}

}
