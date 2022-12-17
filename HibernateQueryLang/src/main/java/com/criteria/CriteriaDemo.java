package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.model.Student;
import com.util.SessionUtil;

public class CriteriaDemo {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		System.out.println("===========================");
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.eq("name", "shan"));
		List<Student> list = criteria.list();
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("===========================");
		Criteria criteria1 = session.createCriteria(Student.class);
		criteria1.add(Restrictions.eq("name", "ravi"));
		List<Student> list1 = criteria1.list();
		for (Student student : list1) {
			System.out.println(student);
		}
		System.out.println("===========================");
		Criteria criteria2 = session.createCriteria(Student.class);
		criteria2.add(Restrictions.eq("fee", 10000.00)); // equal
		List<Student> list2 = criteria2.list();
		for (Student student : list2) {
			System.out.println(student);
		}
		System.out.println("===========================");
		Criteria criteria3 = session.createCriteria(Student.class);
		criteria3.add(Restrictions.gt("fee", 10000.00));// greater then
		List<Student> list3 = criteria3.list();
		for (Student student : list3) {
			System.out.println(student);
		}
		System.out.println("===========================");
		Criteria criteria31 = session.createCriteria(Student.class);
		criteria31.add(Restrictions.ge("fee", 10000.00));// greater then are equal
		List<Student> list31 = criteria31.list();
		for (Student student : list31) {
			System.out.println(student);
		}
		System.out.println("===========================");
		Criteria criteria4 = session.createCriteria(Student.class);
		criteria4.add(Restrictions.lt("fee", 25000.00));// less than
		List<Student> list4 = criteria4.list();
		for (Student student : list4) {
			System.out.println(student);
		}
		System.out.println("===========================");
		Criteria criteria41 = session.createCriteria(Student.class);
		criteria41.add(Restrictions.le("fee", 25000.00));// less than are equal
		List<Student> list41 = criteria41.list();
		for (Student student : list41) {
			System.out.println(student);
		}
		System.out.println("===========================");
		Criteria criteria5 = session.createCriteria(Student.class);
		criteria5.add(Restrictions.ne("fee", 25000.00));// less than are equal
		List<Student> list5 = criteria5.list();
		for (Student student : list5) {
			System.out.println(student);
		}

	}
}
