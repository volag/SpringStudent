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

import com.lc.evaluation.entity.Core;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class CoreMapperTest {

	@Autowired
	CoreMapper co;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindById() {
		System.out.println(co.findById(1).getCourseId());
	}

	@Test
	public void testFindAllCount() {
		System.out.println(co.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<Core> coreList = co.findAll();
		for(Core a:coreList) {
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
		Core core = new Core();
		core.setId(1);
		core.setCourseId(1);
		co.update(core);
	}

	@Test
	public void testAdd() {
		Core core = new Core();
		core.setStudentId(22);
		core.setCourseId(1);
		core.setTeacherId(72);
		co.add(core);
	}

	@Test
	public void testAddAll() {
		Core core = new Core();
		Collection<Core> coreList = new ArrayList<>();
		coreList.add(core);
		co.addAll(coreList);
	}

//	@Test
//	public void testFindByPage() {
//		fail("Not yet implemented");
//	}

}
