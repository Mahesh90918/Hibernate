package com.Hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class findMaxMinSalary {

	public static void main(String[] args) {
		Session ses = SessionUtil.getSession();
		System.out.println("===========================");
		String queryString = "select max(fee) from Student";
		Query query = ses.createQuery(queryString);
		List<Double> list = query.list();
		for (Double ss : list) {
			System.out.println("MAX =" +ss);
		}
		System.out.println("===========================");
		System.out.println("===========================");
		String queryString1 = "select max(fee),min(fee),avg(fee) ,sum(fee)/5 from Student";
		Query query1 = ses.createQuery(queryString1);
		List<Object[]> list1 = query1.list();
		for (Object[] ss : list1) {
			System.out.println("MAX =" + ss[0]);
			System.out.println("MIN =" + ss[1]);
			System.out.println("AVG =" + ss[2]);
			System.out.println("AVG 1 =" + ss[3]);
		}
		System.out.println("===========================");

		System.out.println("===========================");
		String queryString2 = "select sum(fee) from Student";// avg
		Query query2 = ses.createQuery(queryString2);
		List<Double> list2 = query2.list();
		for (Double ss : list2) {
			System.out.println("SUM =" +ss);
		}
		System.out.println("===========================");

	}

}
