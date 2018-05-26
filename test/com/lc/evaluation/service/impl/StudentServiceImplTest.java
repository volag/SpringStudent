package com.lc.evaluation.service.impl;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


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
		fail("Not yet implemented");
	}

	@Test
	public void testQueryAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testQueryPage() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelele() {
		fail("Not yet implemented");
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
		System.out.println(studentServiceImpl.queryQuestionAndAnswer(1));
		
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
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

}
