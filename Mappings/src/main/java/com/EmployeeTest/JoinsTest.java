package com.EmployeeTest;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Department;
import com.model.Employee;
import com.util.SessionUtil;

public class JoinsTest {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Employee as emp INNER JOIN emp.department as dep");
		List<?> list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Object[] row = (Object[]) list.get(i);
			Employee empolyee = (Employee) row[0];
			Department department = (Department) row[1];
			System.out.println("Empolyee Id: " + empolyee.getEid() + ", Empolyee Name: " + empolyee.getEname()
					+ ", Empolyee salary: " + empolyee.getEsal() + ", DeptId: " + department.getDid() + ", DeptName: "
					+ department.getDname());
		}
		Query query1 = session.createQuery("from Department as dep INNER JOIN dep.employee as emp");
		List<?> list1 = query.list();
		for (int i = 0; i < list1.size(); i++) {
			Object[] row1 = (Object[]) list1.get(i);
			Employee empolyee1 = (Employee) row1[0];
			Department department1 = (Department) row1[1];
			System.out.println("Empolyee Id: " + empolyee1.getEid() + ", Empolyee Name: " + empolyee1.getEname()
					+ ", Empolyee salary: " + empolyee1.getEsal() + ", DeptId: " + department1.getDid() + ", DeptName: "
					+ department1.getDname());
		}
		session.beginTransaction().commit();
		session.close();
	}
}
