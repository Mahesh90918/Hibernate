package com.Methods;

import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class SaveOrpresist {
	public static void main(String[] args) {
		Student s1 = new Student(06, "mahesh04", 15000.00);
		Student s2 = new Student(06, "mahesh041", 15000.00);
		Session sess = SessionUtil.getSession();
//		sess.save(s1); // return type
//		sess.save("Student", s1); // its works fine
		sess.persist(s1);// nothing returns
		sess.update(s2);
		sess.beginTransaction().commit();
		sess.close();
	}
}
