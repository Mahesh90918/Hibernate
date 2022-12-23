package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRO_TAB")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "P_ID")
	int pid;
	@Column(name = "P_NAME")
	String pname;

	@ManyToMany(mappedBy = "project")
	List<Employee> empolyee;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String pname, List<Employee> empolyee) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.empolyee = empolyee;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public List<Employee> getEmpolyee() {
		return empolyee;
	}

	public void setEmpolyee(List<Employee> empolyee) {
		this.empolyee = empolyee;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + "]";
	}

	

}
