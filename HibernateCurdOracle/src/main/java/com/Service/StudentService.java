package com.Service;

import java.util.List;

import com.model.Student;

public interface StudentService {
	Integer save(Student student);

	void update(Student student);

	void delete(Integer id);

	Student findById(Integer id);

	List<Student> findAll();
}
