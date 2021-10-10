package com.BootTest.Training;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewController {

	
	@RequestMapping("/Assignment2")
	public ModelAndView assignment2view()
	{
		return new ModelAndView("UserLogin");
	}
}
