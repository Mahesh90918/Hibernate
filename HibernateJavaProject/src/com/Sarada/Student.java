package com.Sarada;

public class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student(Student student) {
		this.id = student.id;
		this.name = student.name;

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Student student = new Student(1, "ksadjh");
		Student s = new Student(student);
		System.out.println(student);
		System.out.println(s);

	}
}
