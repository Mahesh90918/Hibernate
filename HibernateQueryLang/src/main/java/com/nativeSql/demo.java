package com.nativeSql;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.util.SessionUtil;

public class demo {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		System.out.println("===========================");

		SQLQuery sql = session.createSQLQuery("select * from hql");
		List<Object[]> list1 = sql.list();
		for (Object[] objects : list1) {
			System.out.println("ID       :" + objects[0]);
			System.out.println("FEE      :" + objects[1]);
			System.out.println("NAME     :" + objects[2]);
		}
	}
}
