package com.Methods;

import org.hibernate.ReplicationMode;
import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class SaveOrUpdateMethod {

	// SaveOrUpdateMethod and merge both are same acts like
	public static void main(String[] args) {
		Session ses = SessionUtil.getSession();
		Student ss = (Student) ses.get(Student.class, 1);
		System.out.println(ses.contains(ss));// true
		ses.evict(ss); // remove in the session objects
		System.out.println(ses.contains(ss));// false
	//	ses.replicate(ss, ReplicationMode.OVERWRITE);// Retrained the delete session Object
		System.out.println(ses.contains(ss));// true
		System.out.println(ss);
		Student s1 = new Student(01, "mahesh012", 15000.00);
		ses.saveOrUpdate(s1); // NonUniqueObjectException
//		ses.merge(s1);  // but it works fine
		ses.beginTransaction().commit();
		System.out.println(ses.isConnected());// true
		ses.close();
		System.out.println(ses.isConnected());// false
     
	}
}
