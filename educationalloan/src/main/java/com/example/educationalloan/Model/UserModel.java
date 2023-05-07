package com.example.educationalloan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class UserModel {

	@Id
	@GeneratedValue
	private int Id;
	@Override
	public String toString() {
		return "UserModel [Id=" + Id + ", Email=" + Email + ", Password=" + Password + ", UserName=" + UserName
				+ ", MobileNumber=" + MobileNumber + ", UserRole=" + UserRole + "]";
	}
	public UserModel() {
		super();
	}
	public UserModel(int id, String email, String password, String userName, String mobileNumber, String userRole) {
		super();
		Id = id;
		Email = email;
		Password = password;
		UserName = userName;
		MobileNumber = mobileNumber;
		UserRole = userRole;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getUserRole() {
		return UserRole;
	}
	public void setUserRole(String userRole) {
		UserRole = userRole;
	}
	private String Email;
	private String Password;
	private String UserName;
	private String MobileNumber;
	private String UserRole;
}
