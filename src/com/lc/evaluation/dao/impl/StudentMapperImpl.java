package com.lc.evaluation.dao.impl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lc.evaluation.dao.StudentMapper;
import com.lc.evaluation.dao.UserMapper;
import com.lc.evaluation.dto.response.TeacherAssessGroupByCourseClazzStudentDto;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.entity.User;
import com.lc.evaluation.util.PageUtil;

@Repository("studentImpl")
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
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return studentMapper.findById(id);
	}

	@Override
	public long findAllCount() {
		// TODO Auto-generated method stub
		return studentMapper.findAllCount();
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentMapper.findAll();
	}

	@Override
	public void delete(List<Integer> ids) {
		studentMapper.delete(ids);
	}

	@Override
	public void update(Student entity) {
		userMapper.update(entity);
		studentMapper.update(entity);
	}

	@Override
	public void add(Student entity) {
		userMapper.add(entity);
		studentMapper.add(entity);
	}

	@Override
	public void addAll(Collection<Student> entities) {
		
		Collection<User> listU = (Collection)entities; 
		userMapper.addAll(listU);
		studentMapper.addAll(entities);
	}

	@Override
	public PageUtil<Student> findByPage(int page) {
		return studentMapper.findByPage(page);
	}

/*	@Override
	public List<Student> findByIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public List<Student> findByMap(Student entity) {
		// TODO Auto-generated method stub
		return studentMapper.findByMap(entity);
	}


	/*@Override
	public Map findCourses(Integer id) {
		return studentMapper.findCourses(id);
	}*/

}
