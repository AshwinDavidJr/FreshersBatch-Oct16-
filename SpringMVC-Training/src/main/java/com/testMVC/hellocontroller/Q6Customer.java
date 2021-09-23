package com.testMVC.hellocontroller;

import jakarta.validation.constraints.Size;

public class Q6Customer {
	
	@Size(min=8,max=20)
	private String Username;
	
	@Size(min = 6)
	private String Password;
	private String Email;
	private long Contact;
	private String City;
	private long zip;
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
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
	public long getContact() {
		return Contact;
	}
	public void setContact(long contact) {
		Contact = contact;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public long getZip() {
		return zip;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}

}
