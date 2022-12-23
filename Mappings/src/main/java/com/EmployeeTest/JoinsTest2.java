package com.EmployeeTest;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import com.model.Employee;
import com.model.Project;
import com.util.SessionUtil;

public class JoinsTest2 {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Query query = session.createQuery("from Employee as emp right JOIN emp.project as pro");
		List<?> list = query.list();
		for (int i = 0; i < list.size(); i++) {
			Object[] row = (Object[]) list.get(i);
			Employee empolyee = (Employee) row[0];
			Project project = (Project) row[1];
			System.out.println("Empolyee Id: " + empolyee.getEid() + ", Empolyee Name: " + empolyee.getEname()
					+ ", Empolyee salary: " + empolyee.getEsal() + ", Project: " + project.getPid() + ", Project: "
					+ project.getPname());
		}
		
		// cross Join
		Query query1 = session.createQuery("from Employee as emp , Project as pro");
		List<Object[]> list1 = query1.list();
		for (Object[] row : list1) {
			Employee empolyee = (Employee) row[0];
			Project project = (Project) row[1];
			System.out.println("Empolyee Id: " + empolyee.getEid() + ", Empolyee Name: " + empolyee.getEname()
					+ ", Empolyee salary: " + empolyee.getEsal() + ", Project: " + project.getPid() + ", Project: "
					+ project.getPname());
		}

		session.beginTransaction().commit();
		session.close();
	}
}
