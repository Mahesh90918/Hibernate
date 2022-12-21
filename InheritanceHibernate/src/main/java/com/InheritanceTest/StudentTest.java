package com.InheritanceTest;

import org.hibernate.Session;

import com.model.Address;
import com.model.Marks;
import com.model.Student;
import com.util.SessionUtil;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(01);
		s.setName("mahesh");
		s.setFee(1234.00);
		Address a = new Address();
		a.setPhonenumber(63013);
		a.setPincode(532445);
		a.setLocation("lakkupuram");
		Marks m = new Marks();
		m.setMath(99);
		m.setPhy(90);
		m.setScience(92);
		
		Session ses=SessionUtil.getSession();
		ses.save(s);
		ses.save(a);
		ses.save(m);
		ses.beginTransaction().commit();
		ses.close();
	}
}
