package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ADD_TAB")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "A_ID")
	int aid;
	@Column(name = "A_LOC")
	String location;
	@Column(name = "A_PIN")
	long pincode;
	@OneToOne(mappedBy = "address")
	Employee employee;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int aid, String location, long pincode, Employee employee) {
		super();
		this.aid = aid;
		this.location = location;
		this.pincode = pincode;
		this.employee = employee;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", location=" + location + ", pincode=" + pincode + "]";
	}

}
