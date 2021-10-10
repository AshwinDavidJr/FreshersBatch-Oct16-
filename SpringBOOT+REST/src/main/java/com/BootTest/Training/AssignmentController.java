package com.BootTest.Training;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AssignmentController {
	
	@GetMapping("/")
	public ModelAndView Index()
	{
		return new ModelAndView("index");
	}
	/*----------------------------ASSIGNMENT 1------------------------------------*/
	@GetMapping("/Assignment1")
	public String RestAss1()
	{
		return "hello world";
	}
	
	/*----------------------------ASSIGNMENT 2------------------------------------*/
	/*
	 * @GetMapping("/Assignment2") public String RestAss2() {
	 * 
	 * }
	 */
	@Autowired
	validateUser v;
	
	@PostMapping("/Assignment2")
	public String ass2(@Validated @ModelAttribute("user1")User user1)
	{
		
		
		  if (v.ValidateCreds(user1)) 
		  { return "Success"; }
		
		return "Error";
	}
	
	
	/*----------------------------ASSIGNMENT 3------------------------------------*/
	@PostMapping("/Assignment3")
	public List<Address> ass3(@RequestParam("Zipcode") long zipcode)
	{
		
		  List<Address> addresses = new ArrayList<Address>(); 
		  addresses.add(new Address("state 1","city1","country1",873984)); 
		  addresses.add(new Address("state 2","city2","country2",870984)); 
		  addresses.add(new Address("state 3","city3","country3",555555)); 
		  addresses.add(new Address("state 4","city5","country5",000000));
		 
		  return (v.getAddress(addresses, zipcode));

	}
	
	/*----------------------------ASSIGNMENT 4------------------------------------*/
	
	
	
	
}
