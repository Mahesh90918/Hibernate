package com.Methods;

import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class GetMethod {
	public static void main(String[] args) {

		Student s2 = new Student(10, "mahesh041", 15000.00);
		Session sess = SessionUtil.getSession();
		Student ss = (Student) sess.get(Student.class, 1);
//		sess.evict(ss);
		Student ss1 = (Student) sess.get(Student.class, 2);
//		sess.evict(ss1);
		Student ss2 = (Student) sess.get(Student.class, 3);
		Student ss3 = (Student) sess.get(Student.class, 1000);// null
		System.out.println(ss);
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println(ss3);
		sess.beginTransaction().commit();
		sess.close();
	}
}
