package com.example.Crudproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="crud")
public class Crud {

	@Id
	@GeneratedValue
    private int regno;
    @Override
	public String toString() {
		return "Crud [regno=" + regno + ", name=" + name + ", dept=" + dept + "]";
	}
	public Crud() {
		super();
	}
	public Crud(int regno, String name, String dept) {
		super();
		this.regno = regno;
		this.name = name;
		this.dept = dept;
	}
	private String name;
    private String dept;
    public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}  
}


