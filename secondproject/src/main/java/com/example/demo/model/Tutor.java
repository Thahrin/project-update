package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Tutor {

	@Id
	private int phno;
	private String email;
	private String username;
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno=phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
