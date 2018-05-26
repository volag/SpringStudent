package com.lc.evaluation.dao;

import static org.junit.Assert.fail;

import java.util.List;

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
	LogMapper logmapper;
	
	@Test 
	public void findAllLog() {
		System.out.println(logmapper);
		List<Log> logList = logmapper.findAll();
		for(Log log:logList) {
			System.out.println(log);
		}
	}


	@Test
	public void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindByPage() {
		fail("Not yet implemented");
	}

}
