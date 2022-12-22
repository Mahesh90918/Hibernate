package com.StudentTest;

import java.util.Set;

import org.hibernate.Session;

import com.model.Student;
import com.model.Teacher;
import com.util.SessionUtil;

public class RetrieveDataStudent {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Student list = (Student) session.get(Student.class, 1);
		Set<Teacher> set = list.getTeacher();
		for (Teacher teacher : set) {
			System.out.println(teacher.getTid());
			System.out.println(teacher.getTname());
		}
		
//		Query query = session.createQuery("Select s from Student s");
//		List<Student> list = query.list();
//		for (Student student : list) {
//			System.out.println(student.getAddress().getAid());
//		}
		session.close();
	}
}
