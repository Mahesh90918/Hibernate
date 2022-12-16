package com.Hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class ParametarizedQuery2 {
	public static void main(String[] args) {
		Session ses = SessionUtil.getSession();
		System.out.println("======================================");
		String queryString21 = "select s from Student s where s.id=?";
		Query query21 = ses.createQuery(queryString21);
		query21.setParameter(0, 01);
		List<Student> i21 = query21.list();
		System.out.println(i21);
		System.out.println("======================================");
		String queryString211 = "select s from Student s where s.id between ? and ? ";
		Query query211 = ses.createQuery(queryString211);
		query211.setParameter(0, 02);
		query211.setParameter(1, 04);
		List<Student> i211 = query211.list();
		for (Student s : i211) {
			System.out.println(s);
		}
		
	}
}
