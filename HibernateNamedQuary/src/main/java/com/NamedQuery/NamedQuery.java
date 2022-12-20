
package com.NamedQuery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class NamedQuery {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();

		Query query = session.getNamedQuery("Find_All");
		List<Student> list = query.list();
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
