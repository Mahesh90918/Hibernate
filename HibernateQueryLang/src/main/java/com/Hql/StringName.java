package com.Hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class StringName {
	public static void main(String[] args) {
		Session sess = SessionUtil.getSession();
		System.out.println("===============================");
		Query q = sess.createQuery("update Student set fee= :mahesh where id=:maheshid");
		q.setParameter("mahesh", 21000.00);
		q.setParameter("maheshid", 03);
		int i = q.executeUpdate();
		sess.beginTransaction().commit();
		System.out.println(i);
		System.out.println("===============================");
		Query q1 = sess.createQuery("select s from Student s where id=:maheshid");
		q1.setParameter("maheshid", 03);
		List<Student> i1 = q1.list();
		sess.beginTransaction().commit();
		System.out.println(i1);
	}
}
