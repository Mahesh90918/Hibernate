package com.Methods;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.model.Student;

public class LoadMethod {
	public static void main(String[] args) {
		Configuration con = new Configuration().configure("hibernate.conf.xml");
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
		serviceRegistryBuilder.applySettings(con.getProperties());
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
		SessionFactory ses = con.buildSessionFactory(serviceRegistry);
		Session session = ses.openSession();
		// once debug this Application then difference between get and load 
		Student s1 = (Student) session.load(Student.class, 1);
		System.out.println(s1);
		Student s2 = (Student) session.load(Student.class, 2);
		System.out.println(s2);
		Student s3 = (Student) session.load(Student.class, 3);
		System.out.println(s3);
//		Student s4 = (Student) session.load(Student.class, 400);//ObjectNotFoundException
//		System.out.println(s4);
		
//		System.out.println(session.getEntityName(s3));
		
		session.beginTransaction().commit();
		session.close();
	}
}
