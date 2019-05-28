package com.demo.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	
	
	@RequestMapping("/date")
	public String displayDate(Model theModel) {
		theModel.addAttribute("dateMsg", "Today's Date ::"+ new Date());
		String name = null;
		name.length();
		return "dateDisplay";
	}

}
