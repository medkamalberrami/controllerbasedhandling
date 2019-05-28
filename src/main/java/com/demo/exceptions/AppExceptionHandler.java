package com.demo.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException(Model theModel) {

		theModel.addAttribute("errMsg", "Some problem occured. Please try after sometime");
		return "error";
	}

	@ExceptionHandler(value = NoBookFoundException.class)
	public String handleNoBookFoundException() {
		return "customerror";
	}
}
