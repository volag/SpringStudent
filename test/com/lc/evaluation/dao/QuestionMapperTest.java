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

import com.lc.evaluation.entity.Question;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class QuestionMapperTest {

	@Autowired
	QuestionMapper qu;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindById() {
		System.out.println(qu.findById(1).getContext());
	}

	@Test
	public void testFindAllCount() {
		System.out.println(qu.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<Question> questionList = qu.findAll();
		for(Question a:questionList) {
			System.out.println(a);
		}
	}

	@Test
	public void testDelete() {
		List<Integer> list = new ArrayList<>();
		list.add(71);
		qu.delete(list);
	}

	@Test
	public void testUpdate() {
		Question question = new Question();
		question.setId(3);
		question.setContext("CCCC");
		qu.update(question);
	}

	@Test
	public void testAdd() {
		Question question = new Question();
		question.setContext("BBBB");
		qu.add(question);
	}

	@Test
	public void testAddAll() {
		Question question = new Question();
		question.setContext("AAAA");
		Collection<Question> questionList = new ArrayList<>();
		questionList.add(question);
		qu.addAll(questionList);
	}

//	@Test
//	public void testFindByPage() {
//		fail("Not yet implemented");
//	}

}
