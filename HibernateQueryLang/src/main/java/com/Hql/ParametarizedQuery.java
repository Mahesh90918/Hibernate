package com.Hql;

import org.hibernate.Query;
import org.hibernate.Session;

import com.util.SessionUtil;

public class ParametarizedQuery {
	public static void main(String[] args) {
		Session ses = SessionUtil.getSession();
		String queryString = "update Student set fee=?";
		Query query = ses.createQuery(queryString);
		query.setParameter(0, 20000.00);
		int i = query.executeUpdate();
		System.out.println(i);
		ses.beginTransaction().commit();
		System.out.println("===============================");
		String queryString1 = "update Student set fee=? where id=?";
		Query query1 = ses.createQuery(queryString1);
		query1.setParameter(0, 25000.00);
		query1.setParameter(1, 1);
		int i1 = query1.executeUpdate();
		System.out.println(i1);
		ses.beginTransaction().commit();
		System.out.println("======================================");
		System.out.println("===============================");
		String queryString2 = "update Student set name=?,fee=? where id=?";
		Query query2 = ses.createQuery(queryString2);
		query2.setParameter(0, "mahesh01");
		query2.setParameter(1, 25000.00);
		query2.setParameter(2, 1);
		int i2 = query2.executeUpdate();
		System.out.println(i2);
		ses.beginTransaction().commit();
		System.out.println("======================================");
	}
}
