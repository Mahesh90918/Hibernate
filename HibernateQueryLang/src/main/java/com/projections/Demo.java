package com.projections;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;

import com.model.Student;
import com.util.SessionUtil;

public class Demo {
	public static void main(String[] args) {
		Session ses = SessionUtil.getSession();
		System.out.println("====================================");
		Criteria criteria = ses.createCriteria(Student.class);
		criteria.setProjection(Projections.property("name"));
		List<String> list = criteria.list();
		for (String student : list) {
			System.out.println(student);
		}
		System.out.println("====================================");
		Criteria criteria1 = ses.createCriteria(Student.class);
		PropertyProjection p1 = Projections.property("id");
		PropertyProjection p2 = Projections.property("name");
		PropertyProjection p3 = Projections.property("fee");
		ProjectionList li = Projections.projectionList();
		li.add(p1);
		li.add(p2);
		li.add(p3);
		criteria1.setProjection(li);
		List<Object[]> list1 = criteria1.list();
		for (Object[] obj : list1) {
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);
		}
	}
}
