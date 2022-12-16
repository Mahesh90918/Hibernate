package com.Hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class ParticularDataFinding {
	public static void main(String[] args) {
		Session ses = SessionUtil.getSession();
		System.out.println("===========================");
		String queryString2 = "select id,name from Student s";
		Query query2 = ses.createQuery(queryString2);

		List<Object[]> list2 = query2.list();

		for (Object[] ss : list2) {
			System.out.println("ID   =" + ss[0]);
			System.out.println("NAME =" + ss[1]);
			System.out.println("-----------------------");
		}
		System.out.println("===========================");
		// another Way
		String queryString3 = "select s.id,s.name,s.fee from Student s";
		Query query3 = ses.createQuery(queryString3);
		List<Object[]> list3 = query3.list();

//		System.out.println(list3);
		for (Object[] ss : list3) {
			System.out.println("ID   =" + ss[0]);
			System.out.println("NAME =" + ss[1]);
			System.out.println("FEE  =" + ss[2]);
			System.out.println("-----------------------");
		}
		System.out.println("===========================");
	}
}
