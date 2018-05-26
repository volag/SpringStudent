package com.lc.evaluation.dao;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lc.evaluation.entity.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class LogMapperTest {

	@Autowired
	LogMapper lo;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindById() {
		System.out.println(lo.findById(1));
	}

	@Test
	public void testFindAllCount() {
		System.out.println(lo.findAllCount());
	}

	@Test
	public void testFindAll() {
		System.out.println(lo);
		List<Log> logList = lo.findAll();
		for(Log log:logList) {
			System.out.println(log);
		}
	}

	@Test
	public void testDelete() {
		List<Log> logList = new ArrayList<>();
		Log log = new Log();
		log.setId(2);
		logList.add(log);
		lo.delete(logList);
	}

	@Test
	public void testUpdate() {
		Date date = new Date();
		Log log = new Log();
		log.setId(1);
		log.setAction("评教2");
		log.setStartTime(date);
		log.setEndTime(date);
		log.setRealName("陈又龙");
		log.setUserName("15201114");
//		log.setUserType(0);
		lo.update(log);
	}

	@Test
	public void testAdd() {
		Date date = new Date();
		Log log = new Log();
		log.setAction("评教1");
		log.setStartTime(date);
		log.setEndTime(date);
		log.setRealName("陈又龙");
		log.setUserName("15201114");
		log.setUserType(0);
		lo.add(log);
	}

	@Test
	public void testAddAll() {
		List<Log> logList = new ArrayList<>();
		Date date = new Date();
		Log log = new Log();
		log.setAction("评教1");
		log.setStartTime(date);
		log.setEndTime(date);
		log.setRealName("陈又龙");
		log.setUserName("15201114");
		log.setUserType(0);
		logList.add(log);
		lo.addAll(logList);
	}

	@Test
	public void testFindByPage() {
		fail("Not yet implemented");
	}

}
