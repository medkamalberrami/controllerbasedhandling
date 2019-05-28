package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/welcome")
	public String welcome(Model model) {

		model.addAttribute("msg", "Welcome to kamal it chanel");
		String name = null;
		name.length();
		return "welcome";
	}

	
	/* Controller Based Handler */
	/*@ExceptionHandler(value = NullPointerException.class)
	public String handelNullPointerException(Model themodel) {

		themodel.addAttribute("errMsg", "Some problem occured. Please try after sometime");
		return "error";

	}*/

}
