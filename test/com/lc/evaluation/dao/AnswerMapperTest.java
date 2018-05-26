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

import com.lc.evaluation.entity.Answer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class AnswerMapperTest {

	@Autowired
	AnswerMapper an;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindById() {
		System.out.println(an.findById(1).getAnswer());
	}

	@Test
	public void testFindAllCount() {
		System.out.println(an.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<Answer> answerList = an.findAll();
		for(Answer a:answerList) {
			System.out.println(a);
		}
	}

//	@Test
//	public void testDelete() {
//		answer answer = new answer();
//		answer.setId(3);
//		answer answer1 = new answer();
//		answer1.setId(5);
//		Collection<answer> answerList = new ArrayList<>();
//		answerList.add(answer1);
//		answerList.add(answer);
//		as.delete(answerList);
//	}

	@Test
	public void testUpdate() {
		Answer answer = new Answer();
		answer.setId(1);
		answer.setAssessId(1);
		answer.setQuestionId(1);
		answer.setAnswer("B");
		an.update(answer);
	}

	@Test
	public void testAdd() {
		Answer answer = new Answer();
		answer.setAssessId(4);
		answer.setQuestionId(1);
		answer.setAnswer("B");
		an.add(answer);
	}

	@Test
	public void testAddAll() {
		Answer answer = new Answer();
		answer.setAssessId(4);
		answer.setQuestionId(1);
		answer.setAnswer("B");
		Answer answer1 = new Answer();
		answer1.setAssessId(4);
		answer1.setQuestionId(2);
		answer1.setAnswer("A");
		Collection<Answer> answerList = new ArrayList<>();
		answerList.add(answer);
		answerList.add(answer1);
		an.addAll(answerList);
	}

//	@Test
//	public void testFindByPage() {
//		fail("Not yet implemented");
//	}

}
