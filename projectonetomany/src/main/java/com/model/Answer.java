package com.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Answer {
	
	@Id
	private int answerd;
	private String ans;
	
		
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerd, String ans) {
		super();
		this.answerd = answerd;
		this.ans = ans;
	}
	public int getAnswerd() {
		return answerd;
	}
	public void setAnswerd(int answerd) {
		this.answerd = answerd;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	
	

}
