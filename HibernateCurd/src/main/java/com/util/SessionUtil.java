package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class SessionUtil {

	private static SessionFactory sf = null;

	static {
		Configuration configuration = new Configuration();
		configuration.configure("Hibernate.conf.xml");
		ServiceRegistryBuilder registry = new ServiceRegistryBuilder();
		registry.applySettings(configuration.getProperties());
		ServiceRegistry serviceRegistry = registry.buildServiceRegistry();
		sf = configuration.buildSessionFactory(serviceRegistry);
	}

	public static Session getSession() {
		return sf.openSession();

	}

	public static void close(Session session) {
		if (session != null) {
			session.close();
		}
	}

	public static void main(String[] args) {
		System.out.println(SessionUtil.getSession());
	}

}
