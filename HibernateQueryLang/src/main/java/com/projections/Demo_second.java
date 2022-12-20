package com.projections;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import com.model.Student;
import com.util.SessionUtil;

public class Demo_second {
	public static void main(String[] args) {
		Session sess = SessionUtil.getSession();
		Criteria criteria = sess.createCriteria(Student.class);
		ProjectionList pr = Projections.projectionList();
		pr.add(Projections.min("fee"));
		pr.add(Projections.max("fee"));
		pr.add(Projections.sum("fee"));
		pr.add(Projections.count("fee"));
		criteria.setProjection(pr);
		List<Object[]> list1 = criteria.list();
		for (Object[] obj : list1) {
			System.out.println(obj[0]);
			System.out.println(obj[1]);
			System.out.println(obj[2]);
			System.out.println(obj[3]);
		}

	}
}
