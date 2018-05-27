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

import com.lc.evaluation.entity.Course;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class CourseMapperTest {

	@Autowired
	CourseMapper co;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindById() {
		System.out.println(co.findById(1).getName());
	}

	@Test
	public void testFindAllCount() {
		System.out.println(co.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<Course> courseList = co.findAll();
		for(Course a:courseList) {
			System.out.println(a);
		}
	}

	@Test
	public void testDelete() {
		List<Integer> list = new ArrayList<>();
		list.add(71);
		co.delete(list);
	}

	@Test
	public void testUpdate() {
		Course course = new Course();
		course.setId(1);
		course.setName("高等数学");
		co.update(course);
	}

	@Test
	public void testAdd() {
		Course course = new Course();
		course.setName("Java网络编程2");
		course.setNo("123123");
		course.setTeacherName("老师4");
		course.setType("基础课");
		co.add(course);
	}

	@Test
	public void testAddAll() {
		Course course = new Course();
		Collection<Course> courseList = new ArrayList<>();
		course.setName("Java网络编程2");
		course.setNo("123123");
		course.setTeacherName("老师4");
		course.setType("基础课");
		courseList.add(course);
		co.addAll(courseList);
	}

//	@Test
//	public void testFindByPage() {
//		fail("Not yet implemented");
//	}

}
