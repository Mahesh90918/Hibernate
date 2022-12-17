package com.TransactionManagement;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
import com.util.SessionUtil;

public class TransactionDemo {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = SessionUtil.getSession();
			transaction = session.beginTransaction();
			Integer stu = (Integer) session.save(new Student(9, "mahesh9", 33000));
			System.out.println(stu);

			session.update(new Student(8, "siva", 31000));
			Student s = new Student();
			s.setId(07);
			session.delete(s);

			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
