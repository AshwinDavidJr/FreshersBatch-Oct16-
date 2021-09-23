package com.testMVC.hellocontroller;
import java.io.Serializable;
public class Q4User implements Serializable{
	private static final long serialVersionUID = 1l;
	private String userName, Password,Email;
	public Q4User() {
		super();
	}
	public Q4User(String userName,String Password , String Email) {
		super();
		this.userName=userName;
		this.Password=Password;
		this.Email=Email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
