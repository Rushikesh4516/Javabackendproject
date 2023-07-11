package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee2 {

	
	@Id
	private int id;
	private String name;
	
	@ManyToMany
	List<Project> projects;
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
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
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
	
	
}
