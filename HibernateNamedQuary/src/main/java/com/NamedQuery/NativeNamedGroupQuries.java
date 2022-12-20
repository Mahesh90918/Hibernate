package com.NamedQuery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class NativeNamedGroupQuries {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		System.out.println("==========================");
		Query query = session.getNamedQuery("Native_by_id");
		query.setParameter(0, 9);
		List<Student> list = query.list();
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("==========================");
		Query query2 = session.getNamedQuery("Native_by_Name");
		query2.setParameter(0, "shan");
		List<Student> list2 = query2.list();
		for (Student student : list2) {
			System.out.println(student);
		}
		System.out.println("==========================");
		Query query1 = session.getNamedQuery("Native_Update_by_Id");
		query1.setParameter(0, "mahi");
		query1.setParameter(1, 3450);
		query1.setParameter(2, 9);
		System.out.println(query1.executeUpdate());
		session.beginTransaction().commit();

	}
}
