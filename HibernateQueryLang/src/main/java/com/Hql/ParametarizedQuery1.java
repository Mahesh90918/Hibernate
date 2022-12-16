package com.Hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class ParametarizedQuery1 {
	public static void main(String[] args) {
		Session ses = SessionUtil.getSession();
		System.out.println("======================================");
		String queryString3 = "select s.name,s.fee from Student s where s.id between ? and ? ";
		Query query3 = ses.createQuery(queryString3);
		query3.setParameter(0, 02);
		query3.setParameter(1, 04);
		List<Object[]> i3 = query3.list();
		for (Object[] s : i3) {
			System.out.println("NAME ="+s[0]);
			System.out.println("FEE  ="+s[1]);
			System.out.println("--------------------");

		}
	}
}
