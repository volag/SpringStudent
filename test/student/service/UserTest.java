package student.service;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import student.mappers.StudentMapper;
import student.mappers.TeacherMapper;
import student.mappers.UserMapper;
import student.model.Student;
import student.model.User;
import student.util.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class UserTest {

	@Autowired
	private UserMapper userMapper;
	
	/*
	 * ��ѯ�����û�
	 */
	@Test
	public void findList() {
		System.out.println(userMapper);
		List<User> userList=userMapper.find();
		for (User user : userList) {
			System.out.println(user);
		}
	}


	/*
	 * ��ѯ���ݿ����ж����û�
	 */
	@Test
	public void numUser() {
		System.out.println(userMapper);
		int num = userMapper.count();
		System.out.println("�û�������Ϊ��"+num);
	}
	
	@Test
	public void findById() {
		System.out.println(userMapper);
		User user = userMapper.findById(1);
	    System.out.println(user);
	}
	
}
