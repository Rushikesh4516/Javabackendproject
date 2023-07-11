package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Employee2;
import com.model.Project;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("e_p");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		Employee2 e1=new Employee2(1,"Ajay");
		Employee2 e2=new Employee2(2,"Vijay");
		
		Project p1=new Project(101,"E-commerce");
		Project p2=new Project(102,"Exam Portal");
		
		List<Employee2>list_emp=new ArrayList<Employee2>();
				list_emp.add(e1);
				list_emp.add(e2);
				
				List<Project>list_project=new ArrayList<Project>();
				list_project.add(p1);
				list_project.add(p2);
				
				e1.setProjects(list_project);
				p1.setEmp(list_emp);
				
				em.persist(e1);
				em.persist(e2);
				em.persist(p1);
				em.persist(p2);
				
				em.getTransaction().commit();
				System.out.println("Persist data");
				
				
	}

}
