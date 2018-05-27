package com.lc.evaluation.dao;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

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

import com.lc.evaluation.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class UserMapperTest {

	@Autowired
	UserMapper um;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindByUserName() {
		System.out.println(um.findByUserName("15201124"));
	}

	@Test
	public void testFindPasswordByUserName() {
		System.out.println(um.findPasswordByUserName("15201124"));
	}

	@Test
	public void testFindById() {
		System.out.println(um.findById(18));
	}

	@Test
	public void testFindAllCount() {
		System.out.println(um.findAllCount());
	}

	@Test
	public void testFindAll() {
		List<User> userList  = um.findAll();
		for(User user : userList) {
			System.out.println(user);
		}
	}

	@Test
	public void testDelete() {
		List<Integer> list = new ArrayList<>();
		list.add(71);
		um.delete(list);
	}

	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(71);
		user.setUserName("15201227");
		user.setPassword("987456");
		user.setAvatarPath("D");
		user.setBirthday("1997-03-30");
		user.setAddress("江西");
		user.setPhoneNum("15779551676");
		user.setRealName("学生53");
		user.setUserType(0);
		user.setSex(0);
		um.update(user);
	}

	@Test
	public void testAdd() {
		User user = new User();
		user.setUserName("1545115");
		user.setPassword("333333");
		user.setAvatarPath("D");
		user.setBirthday("1997-03-30");
		user.setAddress("江西");
		user.setPhoneNum("15779551676");
		user.setRealName("老师4");
		user.setUserType(1);
		user.setSex(0);
		um.add(user);
		
	}

	@Test
	public void testAddAll() {
		User user = new User();
		user.setUserName("15201228");
		user.setPassword("333333");
		user.setAvatarPath("D");
		user.setBirthday("1997-03-30");
		user.setAddress("江西");
		user.setPhoneNum("15779551676");
		user.setRealName("学生54");
		user.setUserType(0);
		user.setSex(0);
		User user1 = new User();
		user1.setUserName("15201229");
		user1.setPassword("333333");
		user1.setAvatarPath("D");
		user1.setBirthday("1997-03-30");
		user1.setAddress("江西");
		user1.setPhoneNum("15779551676");
		user1.setRealName("学生54");
		user1.setUserType(0);
		user1.setSex(0);
		Collection<User> userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user);
		um.addAll(userList);
	}

	@Test
	public void testFindByPage() {
		fail("Not yet implemented");
	}

}
