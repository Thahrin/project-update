package com.example.notebook.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="note")
public class note {

	@Id
	@GeneratedValue
	@Column(name="no")
	private int no;
	@Override
	public String toString() {
		return "note [no=" + no + ", name=" + name + ", password=" + password + "]";
	}
	public note() {
		super();
	}
	public note(int no, String name, String password) {
		super();
		this.no = no;
		this.name = name;
		this.password = password;
	}
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Column(name="name")
	private String name;
	@Column(name="password")
	private String password;
	
}
