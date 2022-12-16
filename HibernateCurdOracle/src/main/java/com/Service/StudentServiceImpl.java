package com.Service;

import java.util.List;

import com.DataAcessObject.StudentDAOImpl;
import com.model.Student;

public class StudentServiceImpl implements StudentService {

	StudentDAOImpl dao = new StudentDAOImpl();

	@Override
	public Integer save(Student student) {
		return dao.save(student);
	}

	@Override
	public void update(Student student) {
		dao.update(student);

	}

	@Override
	public void delete(Integer id) {
		dao.delete(id);

	}

	@Override
	public Student findById(Integer id) {
		return dao.findById(id);
	}

	@Override
	public List<Student> findAll() {
		return dao.findAll();
	}

}
