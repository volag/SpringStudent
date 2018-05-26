package loginTest;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import student.mappers.LoginMapper;
import student.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class loginTest {

	@Autowired
	private LoginMapper loginmapper;
	
	@Test
	public void verifyLogin() {
		System.out.println(loginmapper);
		Map<String,String> map = new HashMap<String,String>();
		map.put("userName", "15201124");
		map.put("password", "123456");
		User user=loginmapper.verifyLogin(map);
		System.out.println("通过用户名和密码查询："+user);
	}
	
	@Test
	public void findUserByAccount() {
		System.out.println(loginmapper);
		User user = loginmapper.findUserByAccount(1);
	    System.out.println("通过id查询："+user);
	}
	
	@Test
	public void findUserByName() {
		System.out.println(loginmapper);
		User user = loginmapper.findUserByName("15201124");
	    System.out.println("通过用户名查询："+user);
	}
}
