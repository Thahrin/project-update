package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customerdetails")
public class Customer {
  @Id
  @Column(name="No")
  private int no;
  @Override
public String toString() {
	return "Customer [no=" + no + ", name=" + name + ", mail=" + mail + ", password=" + password + ", phno=" + phno
			+ ", product=" + product + ", rate=" + rate + ", amount=" + amount + ", tamount=" + tamount + ", discount="
			+ discount + ", address=" + address + "]";
}
public Customer() {
	super();
}
public Customer(int no, String name, String mail, String password, String phno, String product, String rate,
		String amount, String tamount, String discount, String address) {
	super();
	this.no = no;
	this.name = name;
	this.mail = mail;
	this.password = password;
	this.phno = phno;
	this.product = product;
	this.rate = rate;
	this.amount = amount;
	this.tamount = tamount;
	this.discount = discount;
	this.address = address;
}
@Column(name="Name")
	private String name;
  @Column(name="Mail")
	private String mail;
  @Column(name="Password")
	private String password;
  @Column(name="Phno")
	private String phno;
  @Column(name="Product")
	private String product;
  @Column(name="Rate")
	private String rate;
  @Column(name="Amount")
	private String amount;
  @Column(name="TotalAmount")
	private String tamount;
  @Column(name="Discount")
	private String discount;
  @Column(name="Address")
	private String address;
	
	public int getno() {
		return no;
	}
	public void setno(int no) {
		this.no=no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTamount() {
		return tamount;
	}
	public void setTamount(String tamount) {
		this.tamount = tamount;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
