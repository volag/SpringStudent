package com.lc.evaluation.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lc.evaluation.entity.AssessTimeSection;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class AssessTimeSectionMapperTest {

	@Autowired
	AssessTimeSectionMapper at;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindById() {
		System.out.println(at.findById(1).getStartTime());
	}

	@Test
	public void testFindAllCount() {
		System.out.println(at.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<AssessTimeSection> AssessTimeSectionList = at.findAll();
		for (AssessTimeSection a : AssessTimeSectionList) {
			System.out.println(a);
		}
	}

	@Test
	public void testDelete() {
		List<Integer> list = new ArrayList<>();
		list.add(71);
		at.delete(list);
	}

	@Test
	public void testUpdate() {
		AssessTimeSection assessTimeSection = new AssessTimeSection();
		assessTimeSection.setId(1);
		Date date = new Date();
		assessTimeSection.setStartTime(date);
		assessTimeSection.setEndTime(date);
		at.update(assessTimeSection);
	}

	@Test
	public void testAdd() {
		AssessTimeSection assessTimeSection = new AssessTimeSection();
		Date date = new Date();
		assessTimeSection.setStartTime(date);
		assessTimeSection.setEndTime(date);
		at.add(assessTimeSection);
	}

	@Test
	public void testAddAll() {
		AssessTimeSection assessTimeSection = new AssessTimeSection();
		Date date = new Date();
		assessTimeSection.setStartTime(date);
		assessTimeSection.setEndTime(date);
		Collection<AssessTimeSection> assessTimeSectionList = new ArrayList<>();
		assessTimeSectionList.add(assessTimeSection);
		at.addAll(assessTimeSectionList);
	}

	// @Test
	// public void testFindByPage() {
	// fail("Not yet implemented");
	// }

}
