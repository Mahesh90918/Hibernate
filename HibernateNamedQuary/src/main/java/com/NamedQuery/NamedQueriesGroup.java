package com.NamedQuery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class NamedQueriesGroup {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		System.out.println("====================================");
		Query query = session.getNamedQuery("FindById");
		query.setParameter(0, 1);
		List<Student> list = query.list();
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("====================================");
		Query query1 = session.getNamedQuery("FindByName");
		query1.setParameter(0, "ravi");
		List<Student> list1 = query1.list();
		for (Student student : list1) {
			System.out.println(student);
		}
		System.out.println("====================================");
		Query query2 = session.getNamedQuery("FindByID_And_Name");
		query2.setParameter(0, 8);
		query2.setParameter(1, "Siva");
		List<Student> list2 = query2.list();
		for (Student student : list2) {
			System.out.println(student);
		}
//		System.out.println("====================================");
//		Query query3 = session.getNamedQuery("UpdatebyId");
//		query3.setParameter(0, "mahi");
//		query3.setParameter(1, 34500);
//		query3.setParameter(2, 9);
//		List<Student> list3 = query3.list();
//		for (Student student : list3) {
//			System.out.println(student);
//		}
	}
}
