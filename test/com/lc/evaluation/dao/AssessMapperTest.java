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

import com.lc.evaluation.entity.Assess;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class AssessMapperTest {

	@Autowired
	AssessMapper as;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindById() {
		System.out.println(as.findById(1).getAdvice());
	}

	@Test
	public void testFindAllCount() {
		System.out.println(as.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<Assess> assessList = as.findAll();
		for(Assess a:assessList) {
			System.out.println(a);
		}
	}

//	@Test
//	public void testDelete() {
//		Assess assess = new Assess();
//		assess.setId(3);
//		Assess assess1 = new Assess();
//		assess1.setId(5);
//		Collection<Assess> assessList = new ArrayList<>();
//		assessList.add(assess1);
//		assessList.add(assess);
//		as.delete(assessList);
//	}

	@Test
	public void testUpdate() {
		Assess assess = new Assess();
		assess.setId(3);
		assess.setScore(92);
		assess.setAdvice("顶呱呱！");
		as.update(assess);
	}

	@Test
	public void testAdd() {
		Assess assess = new Assess();
		assess.setId(4);
		assess.setScore(92);
		assess.setAdvice("顶呱呱！");
		as.add(assess);
	}

	@Test
	public void testAddAll() {
		Assess assess = new Assess();
		assess.setId(4);
		assess.setScore(92);
		assess.setAdvice("顶呱呱！");
		Assess assess1 = new Assess();
		assess1.setId(5);
		assess1.setScore(56);
		assess1.setAdvice("顶呱呱1！");
		Collection<Assess> assessList = new ArrayList<>();
		assessList.add(assess);
		assessList.add(assess1);
		as.addAll(assessList);
	}

//	@Test
//	public void testFindByPage() {
//		fail("Not yet implemented");
//	}

}
