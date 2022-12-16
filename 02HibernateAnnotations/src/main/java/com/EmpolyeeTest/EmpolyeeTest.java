package com.EmpolyeeTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.model.Empolyee;

public class EmpolyeeTest {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("/hibernate.conf.xml");
		ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder();
		serviceRegistryBuilder.applySettings(con.getProperties());
		ServiceRegistry serviceRegistry = serviceRegistryBuilder.buildServiceRegistry();
		SessionFactory SessionFactory = con.buildSessionFactory(serviceRegistry);
		Session session = SessionFactory.openSession();
		Empolyee emp = new Empolyee(02, "mahesh", 12344);
		System.out.println(session.save(emp));
		session.beginTransaction().commit();
		session.close();

	}
}
