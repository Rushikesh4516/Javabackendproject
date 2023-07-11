package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.model.Answer;
import com.model.Question;

public class TestController {
	
	public static void main(String[]args) {
		
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("Que_Ans");
	EntityManager em=emf.createEntityManager();
	
	
	Question q=new Question();
	q.setQuestionId(1);
	q.setQuestionName("What Is Java");
	
	Answer ans1=new Answer(1001,"Java Is oops");
	Answer ans2=new Answer(1002,"Java Is Platform Independence");
	
	List<Answer>list=new ArrayList();
	list.add(ans1);
	list.add(ans2);
	
	q.setAnswers(list);
	em.getTransaction().begin();
	em.persist(ans1);
	em.persist(ans2);
	em.persist(q);
	em.getTransaction().commit();
	System.out.println("Saved");
	}
}

		

