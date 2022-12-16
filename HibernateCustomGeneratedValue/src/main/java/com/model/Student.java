package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="StudentCustomGen")
public class Student {
	@Id
	@GenericGenerator(name = "myStuId" ,strategy = "com.CustomGenerate.Serial_Cust_Id_Gen")
	@GeneratedValue(generator = "myStuId",strategy = GenerationType.AUTO)
	@Column(name = "Stu_Id")
	String id;
	@Column(name = "Stu_Name")
	String name;
	@Column(name = "Stu_Fee")
	double fee;

	public Student() {
		
	
	}

	public Student(String id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}

}
