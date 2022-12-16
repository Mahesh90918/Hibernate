package com.StudentTest;

import java.util.List;

import com.Service.StudentServiceImpl;
import com.model.Student;

public class StudentTest {
	public static void main(String[] args) {

		StudentServiceImpl service = new StudentServiceImpl();

		List<Student> list = service.findAll();
		for (Student student : list) {
			System.out.println(student);
		}

		// Student s= service.findById(3);
//	System.out.println(s);

//		Student student = new Student(200, "omeeee", 12343.00);
//		Integer i = service.save(student);
//		System.out.println(i);

		System.out.println("success");
		// service.delete(101);

//		Student student=new Student(05, "subbu", 11111.00);
//		service.update(student);
	}
}
