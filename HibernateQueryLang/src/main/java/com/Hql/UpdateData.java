package com.Hql;

import org.hibernate.Query;
import org.hibernate.Session;

import com.util.SessionUtil;

public class UpdateData {
	public static void main(String[] args) {
		Session ses = SessionUtil.getSession();
//		String queryString = "update Student set fee=10000.00";
//		Query query = ses.createQuery(queryString);
//		int i = query.executeUpdate();
//		System.out.println(i);
//		ses.beginTransaction().commit();
		System.out.println("===============================");
		String queryString1 = "update Student set fee=30000.00 where id=1";
		Query query1 = ses.createQuery(queryString1);
		int i1 = query1.executeUpdate();
		System.out.println(i1);
		ses.beginTransaction().commit();
		System.out.println("======================================");
	}
}
