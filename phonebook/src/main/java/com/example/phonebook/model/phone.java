package com.example.phonebook.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="phonedetails")
public class phone {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Override
	public String toString() {
		return "phone [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	public phone() {
		super();
	}
	public phone(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
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
