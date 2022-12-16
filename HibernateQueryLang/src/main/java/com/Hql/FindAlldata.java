package com.Hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class FindAlldata {
	public static void main(String[] args) {
		// single line of query we can go Method
		// group of data operation we can HQL
		// entity name and properties we need in HQL
		
		Session ses = SessionUtil.getSession();
		System.out.println("===========================");
		String queryString="from Student";
		Query query=ses.createQuery(queryString);
		List<Student> list=	query.list();
		for (Student ss : list) {
			System.out.println(ss);
		}
		System.out.println("===========================");
		String queryString1="select s from Student s";
		Query query11=ses.createQuery(queryString1);
		List<Student> list1=query11.list();
		for (Student ss : list1) {
			System.out.println(ss);
		}
		
		System.out.println("===========================");
		System.out.println("===========================");
		String queryString12="select s.name from Student s";
		Query query12=ses.createQuery(queryString12);
		List<String> list12=query12.list();
		for (String ss : list12) {
			System.out.println(ss);
		}
		
		System.out.println("===========================");
		System.out.println("===========================");
		String queryString1211="select name from Student";
		Query query1211=ses.createQuery(queryString1211);
		List<String> list1211=query1211.list();
		for (String ss : list1211) {
			System.out.println(ss);
		}
		
		System.out.println("===========================");
		Query query123=ses.createQuery("from Student");  
		query123.setFirstResult(0);  
		query123.setMaxResults(3);  
		List list123=query123.list();
		System.out.println(list123);
		System.out.println("===========================");
		Query query1234=ses.createQuery("from Student");
		
		List<Student> list1234=query1234.list();
		for (Student ss : list1234) {
			System.out.println(ss.getName());
			System.out.println(ss.getFee());
		}
		System.out.println("=============================");
		Query query4=ses.createQuery("from Student where fee > 21000");
		
		List<Student> list4=query4.list();
		for (Student ss : list4) {
			System.out.println(ss);
			
		}
		System.out.println("=============================");
		
//		ses.save(new Student(05, "ravi", 1234));
//		ses.beginTransaction().commit();
//		ses.close();

	}
}
