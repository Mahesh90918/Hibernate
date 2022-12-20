package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

// Single NamedQuery
@NamedQuery(name = "Find_All", query = "from Student")
//Multiple NamedQuery
//Dml Query Not Supported
@NamedQueries(value = {
		// Entity Name and properties
		@NamedQuery(name = "FindById", query = "Select s from Student s where id=?"),
		@NamedQuery(name = "FindByName", query = "Select s from Student s where name=?"),
		@NamedQuery(name = "FindByID_And_Name", query = "Select s from Student s where id=? and name=?")

})
// Native named Queries
// table named and column names in Databases
@NamedNativeQuery(name = "Native_FIND_ALL", query = "SELECT *FROM HQL", resultClass = Student.class)
// GROUP OF DATA
@NamedNativeQueries(value = {
		@NamedNativeQuery(name = "Native_by_id", query = "SELECT *FROM HQL WHERE S_ID=?", resultClass = Student.class),
		@NamedNativeQuery(name = "Native_by_Name", query = "SELECT *FROM HQL WHERE S_NAME=?", resultClass = Student.class),
		@NamedNativeQuery(name = "Native_Update_by_Id", query = "UPDATE HQL SET S_NAME=?,S_FEE=? WHERE S_ID=?", resultClass = Student.class) })

@Entity
@Table(name = "HQL")
public class Student {
	@Id
	@Column(name = "S_Id")
	int id;
	@Column(name = "S_Name")
	String name;
	@Column(name = "S_Fee")
	double fee;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, double fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
