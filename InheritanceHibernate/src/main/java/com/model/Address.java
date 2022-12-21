package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("address")
public class Address extends Student {
	@Column(name = "phoneNumber")
	int phonenumber;
	@Column(name = "PinCode")
	int pincode;
	@Column(name = "Location")
	String location;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(int phonenumber, int pincode, String location) {
		super();
		this.phonenumber = phonenumber;
		this.pincode = pincode;
		this.location = location;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Address [phonenumber=" + phonenumber + ", pincode=" + pincode + ", location=" + location + "]";
	}

}
