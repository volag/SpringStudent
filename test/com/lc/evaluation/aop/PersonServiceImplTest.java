package com.lc.evaluation.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class PersonServiceImplTest {

	@Test
	public void test() {
		PersonServiceImpl p = new PersonServiceImpl();
		p.getPersonName(1);
	}

}
