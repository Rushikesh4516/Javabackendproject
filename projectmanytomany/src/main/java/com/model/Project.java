package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	
	@Id
	private int pid;
	private String name;
	
	@ManyToMany
	private List<Employee2>emp;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
		
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee2> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee2> emp) {
		this.emp = emp;
	}

	
	
}
