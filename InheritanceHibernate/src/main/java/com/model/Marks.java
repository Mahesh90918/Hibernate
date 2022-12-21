package com.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("marks")
public class Marks extends Student{
	@Column(name = "PhySics")
	int phy;
	@Column(name = "Maths")
	int math;
	@Column(name = "Science")
	int science;

	public Marks() {
		// TODO Auto-generated constructor stub
	}

	public Marks(int phy, int math, int science) {
		super();
		this.phy = phy;
		this.math = math;
		this.science = science;
	}

	public int getPhy() {
		return phy;
	}

	public void setPhy(int phy) {
		this.phy = phy;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	@Override
	public String toString() {
		return "Marks [phy=" + phy + ", math=" + math + ", science=" + science + "]";
	}

}
