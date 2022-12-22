package com.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "STU_TAB")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Stu_ID")
	int sid;
	@Column(name = "Stu_NAME")
	String name;
	@Column(name = "Stu_FEE")
	double fee;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "aid")
	Address address;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "sch_id")
	School school;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "Stu_Teacher", joinColumns = { @JoinColumn(name = "sid") }, inverseJoinColumns = {
			@JoinColumn(name = "tid") })
	Set<Teacher> teacher;

// does not allow duplicates
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String name, double fee, Address address, School school, Set<Teacher> teacher) {
		super();
		this.sid = sid;
		this.name = name;
		this.fee = fee;
		this.address = address;
		this.school = school;
		this.teacher = teacher;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Set<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(Set<Teacher> teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", fee=" + fee + ", address=" + address + ", school=" + school
				+ ", teacher=" + teacher + "]";
	}

}
