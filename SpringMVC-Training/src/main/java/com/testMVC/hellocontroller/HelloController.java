package com.testMVC.hellocontroller;

import java.io.Console;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/Assignments")
public class HelloController {

	/*--------------------Question 1-----------------------------------------*/
	@RequestMapping("/welcomeQ1")
	public ModelAndView helloworld() {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "hi user,you clicked a button to reach this new page");
		return modelandview;
	}

	/*--------------------Question 2-----------------------------------------*/
	@RequestMapping("/Q2")
	public ModelAndView Question2Controller() {
		ModelAndView modelandview = new ModelAndView("Question2");
		return modelandview;
	}

	@RequestMapping(value = "/q2result", method = RequestMethod.POST)
	public ModelAndView SimpleIntrestController(@RequestParam("amount") String principle,
			@RequestParam("rate") String rate, @RequestParam("time") String time) {
		ModelAndView modelandview = new ModelAndView("Question2res");

		var p = Integer.parseInt(principle);
		var r = Integer.parseInt(rate);
		var t = Integer.parseInt(time);
		var si = (p * r * t) / 100;
		modelandview.addObject("sip", si);
		return modelandview;
	}

	/*--------------------Question 3-----------------------------------------*/

	String demoUserName = "test1";
	String demoUserEmail = "test@test.com";
	String demoUserPassword = "password";

	@RequestMapping("/Q3")
	public ModelAndView Question3Controller() {
		return new ModelAndView("Question3Form");
	}

	@RequestMapping(value = "/q3result", method = RequestMethod.POST)
	public ModelAndView userController(@ModelAttribute("user1") User user1, BindingResult result) {

		if (result.hasErrors()) {
			return new ModelAndView("Question3Form");

		}
		

		 if (user1.getUserName().equals(demoUserName)&&user1.getEmail().equals(demoUserEmail)&&user1.getPassword().equals(demoUserPassword)) 
			 return new ModelAndView("Q3Success"); 
		 else 
			 return new ModelAndView("Q3Error");
		 

	}
	
/*--------------------Question 4-----------------------------------------*/
	

	@RequestMapping("/Q4")
	public ModelAndView Question4Controller() {
		return new ModelAndView("Q4Registration");
	}
	
	@RequestMapping("/Q4Login")
	public ModelAndView Question4LoginController() {
		return new ModelAndView("Q4login");
	}
	
	@RequestMapping( value = "/Q4Register", method = RequestMethod.POST)
	public ModelAndView Question4RegController(@ModelAttribute("user1") User user1) {
		return new ModelAndView("Q4login");
	}
	
	
	
/*--------------------Question 5-----------------------------------------*/
	

	@RequestMapping("/Q5")
	public ModelAndView Question5Controller() {
		return new ModelAndView("Q6Registration");
	}
	

	/*--------------------Question 6-----------------------------------------*/
	

	@RequestMapping("/Q6")
	public ModelAndView Question6Controller() {
		return new ModelAndView("Q6Registration");
	}
	
	@RequestMapping(value = "/Q6res", method = RequestMethod.POST)
	public ModelAndView customerController(@Valid @ModelAttribute("customer1") Q6Customer customer1, BindingResult result) {

		System.out.println("checking for errors");
		if (result.hasErrors()) {
			return new ModelAndView("Q6Registration");

		}
		System.out.println("no errors");
		return new ModelAndView("Q3Success");

		 

	}
/*--------------------Question 7-----------------------------------------*/
	

	@RequestMapping("/Q7")
	public ModelAndView Question7Controller() {
		return new ModelAndView("Q6Registration");
	}
/*--------------------Question 8-----------------------------------------*/
	

	@RequestMapping("/Q8")
	public ModelAndView Question8Controller() {
		return new ModelAndView("Q6Registration");
	}
/*--------------------Question 9-----------------------------------------*/
	

	@RequestMapping("/Q9")
	public ModelAndView Question9Controller() {
		return new ModelAndView("Q6Registration");
	}
/*--------------------Question 10-----------------------------------------*/
	

	@RequestMapping("/Q10")
	public ModelAndView Question10Controller() {
		return new ModelAndView("Q6Registration");
	}
	
	
}
