package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.model.Student;
import com.util.SessionUtil;

public class OrOperator {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		System.out.println("===========================");
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.or(Restrictions.eq("name", "shan"),Restrictions.eq("fee", 1234.00)));
		List<Student> list = criteria.list();
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println("===========================");
		Criteria criteria2 = session.createCriteria(Student.class);
		criteria2.add(Restrictions.or(Restrictions.eq("fee", 1234.00),Restrictions.eq("fee", 10000.00)));
		List<Student> list2 = criteria2.list();
		for (Student student : list2) {
			System.out.println(student);
		}
	}
}
