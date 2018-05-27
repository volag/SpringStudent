package com.lc.evaluation.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lc.evaluation.entity.Teacher;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class TeacherMapperTest {

	@Autowired
	TeacherMapper te;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindByUserName() {
		System.out.println(te);
		Teacher Teacher = te.findByUserName("15201124");
			System.out.println(Teacher);
	}

	@Test
	public void testFindPasswordByUserName() {
		System.out.println(te.findPasswordByUserName("15201124"));
	}

	@Test
	public void testFindById() {
		System.out.println(te.findById(72));
	}

	@Test
	public void testFindAllCount() {
		System.out.println(te.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<Teacher> teacherList  = te.findAll();
		for(Teacher teacher : teacherList) {
			System.out.println(teacher);
		}
	}

	@Test
	public void testDelete() {
		List<Integer> list = new ArrayList<>();
		list.add(71);
		te.delete(list);
	}
//
//	@Test
//	public void testUpdate() {
//		
//	}

	@Test
	public void testAdd() {
		Teacher Teacher = new Teacher();
		Teacher.setId(79);
		te.add(Teacher);
	}

	@Test
	public void testAddAll() {
		Teacher teacher = new Teacher();
		teacher.setId(75);
		Teacher teacher1 = new Teacher();
		teacher1.setId(79);
		Collection<Teacher> teacherList = new ArrayList<>();
		teacherList.add(teacher);
		teacherList.add(teacher1);
		te.addAll(teacherList);
	}

//	@Test
//	public void testFindByPage() {
//		fail("Not yet implemented");
//	}

}
