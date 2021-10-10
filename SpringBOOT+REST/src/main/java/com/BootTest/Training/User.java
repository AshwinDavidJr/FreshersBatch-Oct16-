package com.BootTest.Training;

import org.springframework.lang.NonNull;

public class User {
@NonNull
private String username;
@NonNull
private String Password;



public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}



}
