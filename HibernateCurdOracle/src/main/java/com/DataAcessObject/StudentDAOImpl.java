package com.DataAcessObject;

import java.util.List;

import org.hibernate.Session;

import com.model.Student;
import com.util.SessionUtil;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public Integer save(Student student) {

		Session session = SessionUtil.getSession();
		Integer studentpk = (Integer) session.save(student);
		session.beginTransaction().commit();
		session.close();
		return studentpk;

	}

	@Override
	public void update(Student student) {
		Session session = SessionUtil.getSession();
		session.update(student);
		session.beginTransaction().commit();
		session.close();
	}

	@Override
	public void delete(Integer id) {
		Session session = SessionUtil.getSession();
		Student s = new Student();
		s.setId(id);
		session.delete(s);
		session.beginTransaction().commit();
		session.close();

	}

	@Override
	public Student findById(Integer id) {
		Session session = SessionUtil.getSession();

		Student s = (Student) session.get(Student.class, id);
		session.beginTransaction().commit();
		session.close();
		return s;
		// return (Student) SessionUtil.getSession().get(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		return SessionUtil.getSession().createQuery("from Student").list();
	}

}
