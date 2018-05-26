package com.lc.evaluation.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lc.evaluation.dao.impl.StudentMapperImpl;
import com.lc.evaluation.entity.Student;
import com.lc.evaluation.entity.basic.EntityUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class StudentMapperTest {

	@Autowired()
//	@Resource(name="studentImpl")
	StudentMapperImpl stu;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindByUserName() {
		System.out.println(stu);
		Student student = stu.findByUserName("15201124");
			System.out.println(student);
	}

	@Test
	public void testFindPasswordByUserName() {
		System.out.println(stu.findPasswordByUserName("15201124"));
	}

	@Test
	public void testFindById() {
		System.out.println(stu.findById(18));
	}

	@Test
	public void testFindAllCount() {
		System.out.println(stu.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<Student> studentList  = stu.findAll();
		for(EntityUser student : studentList) {
			System.out.println(student);
		}
	}

	@Test
	public void testDelete() {
		Student student = new Student();
		student.setId(72);
		Student student1 = new Student();
		student1.setId(73);
		Collection<Student> studentList = new ArrayList<>();
		studentList.add(student);
		studentList.add(student1);
		stu.delete(studentList);
	}

	@Test
	public void testUpdate() {
		Date date = new Date();
		Student student = new Student();
		student.setId(18);
		student.setEnterTime(date);
		student.setGradeId("152011");
		stu.update(student);
	}

	@Test
	public void testAdd() {
		Date date = new Date();
		Student student = new Student();
		student.setId(73);
		student.setEnterTime(date);
		student.setGradeId("152011");
		stu.add(student);
	}

	@Test
	public void testAddAll() {
		Date date = new Date();
		Student student = new Student();
		student.setId(72);
		student.setEnterTime(date);
		student.setGradeId("152011");
		Student student1 = new Student();
		student1.setId(73);
		student1.setEnterTime(date);
		student1.setGradeId("152011");
		Collection<Student> studentList = new ArrayList<>();
		studentList.add(student);
		studentList.add(student1);
		stu.addAll(studentList);
	}

//	@Test
//	public void testFindByPage() {
//		fail("Not yet implemented");
//	}

}
