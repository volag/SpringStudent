package student.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import student.mappers.AdminStudentMapper;
import student.mappers.TeacherMapper;
import student.mappers.UserMapper;
import student.model.Student;
import student.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mybatis-config.xml")
public class StudentTest {

	@Autowired
	private AdminStudentMapper adminStudentMapper;
	
	@Test
	public void testList() {
		System.out.println(adminStudentMapper);
		List<Student> studentList=adminStudentMapper.find();
		for (Student s : studentList) {
			System.out.println(s);
		}
	}

//	@Test
//	public void addStudent() {
//		System.out.println(adminStudentMapper);
//		Student student = new Student(2,"2015-09-12");
//		int rs=adminStudentMapper.add(student);
//        if(rs>0) {
//        	System.out.println("添加学生成功！");
//        }
//	}
	
//	@Test
//	public void updateStudent() {
//		System.out.println(adminStudentMapper);
//		Student student = new Student(2,"2015-09-12");
//		int rs=adminStudentMapper.add(student);
//        if(rs>0) {
//        	System.out.println("更新学生成功！");
//        }
//	}
	
	@Test
	public void findById() {
		System.out.println(adminStudentMapper);
		Student student = adminStudentMapper.findById(2);
	    System.out.println(student);
	}
	
	@Test
	public void findByIdWithUser() {
		System.out.println(adminStudentMapper);
		Student student = adminStudentMapper.findByIdWithUser(1);
	    System.out.println(student);
	}
}
