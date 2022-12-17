package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.model.Student;
import com.util.SessionUtil;

public class AllOperators {
	public static void main(String[] args) {
		Session ses = SessionUtil.getSession();
		System.out.println("====================================");
//		Criteria criteria = ses.createCriteria(Student.class);
//		criteria.addOrder(Order.asc("fee"));// ascending order
//		List<Student> list = criteria.list();
//		for (Student student : list) {
//			System.out.println(student);
//		}
		System.out.println("====================================");
		Criteria criteria = ses.createCriteria(Student.class);
		criteria.addOrder(Order.desc("fee"));// Descending
		List<Student> list = criteria.list();
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("====================================");
		Criteria criteria1 = ses.createCriteria(Student.class);
		criteria1.add(Restrictions.between("name", "m", "ravi"));
		List<Student> list1 = criteria1.list();
		for (Student student : list1) {
			System.out.println(student);
		}
		System.out.println("====================================");
		Criteria criteria2 = ses.createCriteria(Student.class);
		criteria2.add(Restrictions.between("id", 0, 3));
		List<Student> list2 = criteria2.list();
		for (Student student : list2) {
			System.out.println(student);
		}
		System.out.println("====================================");
		Criteria criteria3 = ses.createCriteria(Student.class);
		criteria3.add(Restrictions.like("name", "siva"));// ilike lower words
		List<Student> list3 = criteria3.list();
		for (Student student : list3) {
			System.out.println(student);
		}
	}
}
