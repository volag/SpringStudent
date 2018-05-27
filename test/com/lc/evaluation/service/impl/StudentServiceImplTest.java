package com.lc.evaluation.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lc.evaluation.entity.Student;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class StudentServiceImplTest {
	
	@Autowired
	StudentServiceImpl studentServiceImpl;

	@Test
	public void testStudentServiceImpl() {
		fail("Not yet implemented");
	}

	@Test
	public void testQuery() {
		assertEquals(true, studentServiceImpl.query(55) != null);
	}

	@Test
	public void testQueryAll() {
		
		assertEquals(52, studentServiceImpl.queryAll().size());
		
//		System.out.println(studentServiceImpl.queryAll().size());
//		fail("Not yet implemented");
	}

	@Test
	public void testQueryPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelele() {
//		Student stu = new Student();
//		stu.setId(78);
		List<Integer> ids = new ArrayList<>();
		ids.add(79);
		studentServiceImpl.delele(ids);
	}

	@Test
	public void testQueryCourses() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubmitAssessQuestionAndAnswer() {
		
	}

	@Test
	public void testQueryQuestionAndAnswer() {
//		System.out.println();
		assertEquals(10, studentServiceImpl.queryQuestionAndAnswer(1).size());
//		fail("Not yet implemented");
	}

	@Test
	public void testAbstractUserService() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsExist() {
		fail("Not yet implemented");
	}

	@Test
	public void testLogIn() {
		fail("Not yet implemented");
	}

	@Test
	public void testAbstractService() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		Student stu = new Student();
		stu.setAddress("南昌航空大学");
		stu.setUserName("15201190");
		stu.setGradeId("1");
		studentServiceImpl.add(stu);
//		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
