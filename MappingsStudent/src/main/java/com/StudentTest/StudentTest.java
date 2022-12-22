package com.StudentTest;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;

import com.model.Address;
import com.model.School;
import com.model.Student;
import com.model.Teacher;
import com.util.SessionUtil;

public class StudentTest {
	public static void main(String[] args) {
		School sch = new School();
		sch.setSch_name("SISTEM");
		Address address = new Address();
		address.setLocation("PALAVALASA");
		address.setPincode(532445);
		Teacher t1 = new Teacher();
		t1.setTname("Gowari");
		Teacher t2 = new Teacher();
		t2.setTname("Arun Kumar");
		Set<Teacher> set = new HashSet<>();
		set.add(t1);
		set.add(t2);
		Student s1 = new Student(2, "Mahesh", 25000.00, address, sch, set);
		Session session = SessionUtil.getSession();
		session.save(s1);
		session.beginTransaction().commit();
		session.close();
	}
}
