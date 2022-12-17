package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.model.Student;
import com.util.SessionUtil;

public class AndOperator {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		System.out.println("============AND===============");
		Criteria criteria1 = session.createCriteria(Student.class);
		criteria1.add(Restrictions.and(Restrictions.eq("name", "shan"), Restrictions.eq("fee", 10000.00)));
		List<Student> list1 = criteria1.list();
		for (Student student : list1) {
			System.out.println(student);
		}
	}
}
