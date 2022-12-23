package com.EmployeeTest;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.model.Department;
import com.model.Employee;
import com.model.Project;
import com.util.SessionUtil;

public class CriteriaJoins {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Criteria criteria = session.createCriteria(Department.class, "mahesh");
		criteria.setFetchMode("mahesh.employee", FetchMode.JOIN);
		criteria.createAlias("mahesh.employee", "emp");
		List<Department> list = criteria.list();
		for (Department department : list) {
			System.out.println(department);
			System.out.println(department.getEmployee());
		}
	}
}
