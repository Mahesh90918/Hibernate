package com.StudentTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.model.Student;

public class StudentTest {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("Hibernate.conf.xml");
		ServiceRegistryBuilder ServiceRegistryBuilder = new ServiceRegistryBuilder();
		ServiceRegistryBuilder.applySettings(con.getProperties());
		ServiceRegistry serviceRegistry = ServiceRegistryBuilder.buildServiceRegistry();
		SessionFactory SessionFactory = con.buildSessionFactory(serviceRegistry);
		Session session = SessionFactory.openSession();
		Student st1 = new Student("", "jhasg", 65000);
		session.save(st1);
		session.beginTransaction().commit();
		session.close();
	}
}
