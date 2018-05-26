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

import com.lc.evaluation.entity.Admin;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class AdminMapperTest {

	@Autowired
	AdminMapper ad;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindByUserName() {
		System.out.println(ad);
		Admin admin = ad.findByUserName("88888888");
			System.out.println(admin);
	}

	@Test
	public void testFindPasswordByUserName() {
		System.out.println(ad.findPasswordByUserName("88888888"));
	}

	@Test
	public void testFindById() {
		System.out.println(ad.findById(75));
	}

	@Test
	public void testFindAllCount() {
		System.out.println(ad.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<Admin> adminList  = ad.findAll();
		for(Admin admin : adminList) {
			System.out.println(admin);
		}
	}

	@Test
	public void testDelete() {
		Admin admin = new Admin();
		admin.setId(75);
		Collection<Admin> adminList = new ArrayList<>();
		adminList.add(admin);
		ad.delete(adminList);
	}
//
//	@Test
//	public void testUpdate() {
//		
//	}

	@Test
	public void testAdd() {
		Admin admin = new Admin();
		admin.setId(75);
		ad.add(admin);
	}

	@Test
	public void testAddAll() {
		Admin admin = new Admin();
		admin.setId(75);
		Collection<Admin> adminList = new ArrayList<>();
		adminList.add(admin);
		ad.addAll(adminList);
	}

//	@Test
//	public void testFindByPage() {
//		fail("Not yet implemented");
//	}

}
