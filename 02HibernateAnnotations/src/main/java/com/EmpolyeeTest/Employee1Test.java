package com.EmpolyeeTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.model.Employee1;

public class Employee1Test {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("/hibernate.conf.xml");
		ServiceRegistryBuilder srb = new ServiceRegistryBuilder();
		srb.applySettings(con.getProperties());
		ServiceRegistry serviceRegistry = srb.buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(serviceRegistry);
		Session ses = sf.openSession();
		Employee1 emp1 = new Employee1(1, "mahesh", 43212);
		System.out.println(ses.save(emp1));

		ses.beginTransaction().commit();
		ses.close();
	}
}
