package com.EmployeeTest;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.model.Address;
import com.model.Department;
import com.model.Employee;
import com.model.Project;
import com.util.SessionUtil;

public class EmployeeTest {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Address a = new Address();
		a.setLocation("palakonda");
		a.setPincode(532445);
		Project p1 = new Project();
		p1.setPname("mahesh1_proj");
		Project p2 = new Project();
		p2.setPname("mahesh2_proj");
		List<Project> p = new ArrayList<>();
		p.add(p1);
		p.add(p2);
		Department d = new Department();
		d.setDname("Software Pvt");

		Employee e = new Employee();
		e.setEid(1);
		e.setEname("Mahesh");
		e.setEsal(50000.00);
		e.setAddress(a);
		e.setDepartment(d);
		e.setProject(p);

		session.save(e);
		session.beginTransaction().commit();
	}
}
