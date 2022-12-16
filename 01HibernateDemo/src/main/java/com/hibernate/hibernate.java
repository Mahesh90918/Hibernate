package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class hibernate {
	public static void main(String[] args) {
		Student s1 = new Student(05, "shan", 11234.00);
		Student s2 = new Student(01, "Hari", 11234.00);
		Configuration conf = new Configuration();
		conf.configure("hibernate.conf.xml");
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		session.save(s1);
		session.update(s2);
//		session.delete(s2);
		session.beginTransaction().commit();
		session.close();
		System.out.println("success");
	}
}
