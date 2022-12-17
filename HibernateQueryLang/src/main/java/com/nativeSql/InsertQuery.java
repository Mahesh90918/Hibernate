package com.nativeSql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.util.SessionUtil;

public class InsertQuery {
	public static void main(String[] args) {
		Session sess = SessionUtil.getSession();
		String queryString = "insert into hql values(7,1234,'siva')";
//		String queryString1 = "insert into Student(name,fee) values(10,12343,'mahi')";
		SQLQuery q = sess.createSQLQuery(queryString);
		int ss = q.executeUpdate();
		System.out.println(ss);
		sess.beginTransaction().commit();
	}
}
