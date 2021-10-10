package com.BootTest.Training;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class validateUser {

	public boolean ValidateCreds( User user) {
		
		if (user.getUsername().equals("User1")&&user.getPassword().equals("password")) {
			
			return true;
			
			
		}
		return false;
	}
	
	 public java.util.List<Address> getAddress(List<Address> address, long zipcode){
	  
		 List<Address> findings = new ArrayList<Address>();
	  for (Address add : address) 
		if (add.getZipCode()==zipcode) 
			findings.add(add);
		
	 return findings;
	  
	 }
	 
}
