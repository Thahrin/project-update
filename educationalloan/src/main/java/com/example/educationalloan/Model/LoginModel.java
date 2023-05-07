package com.example.educationalloan.Model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Table(name="login")
public class LoginModel {

	@Id
	private String Email;
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
	private String Password;
}
