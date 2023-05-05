package com.example.bookstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="storedetail")
public class store {

	@Id
	@GeneratedValue
	@Column(name="id")
    private int id;

	@Override
	public String toString() {
		return "store [id=" + id + ", mail=" + mail + ", passcode=" + passcode + ", book=" + book + ", author=" + author
				+ ", amount=" + amount + ", taype=" + taype + ", discount=" + discount + ", address=" + address
				+ ", name=" + name + "]";
	}
	public store() {
		super();
	}
	public store(int id, String mail, String passcode, String book, String author, String amount, String taype,
			String discount, String address, String name) {
		super();
		this.id = id;
		this.mail = mail;
		this.passcode = passcode;
		this.book = book;
		this.author = author;
		this.amount = amount;
		this.taype = taype;
		this.discount = discount;
		this.address = address;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPasscode() {
		return passcode;
	}
	public void setPasscode(String passcode) {
		this.passcode = passcode;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getTaype() {
		return taype;
	}
	public void setTaype(String taype) {
		this.taype = taype;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="mail")
	private String mail;
	@Column(name="passcode")
	private String passcode;
	@Column(name="book")
	private String book;
  @Column(name="Author")
	private String author;
  @Column(name="Amount")
	private String amount;
  @Column(name="Type")
	private String taype;
  @Column(name="Discount")
	private String discount;
  @Column(name="Address")
	private String address;
  @Column(name="name")
  private String name;
}
