package com.org.main.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserAuthenticationController {	
	
	@RequestMapping("/")
	public String handleAuthenticateUser() {
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String handleloginPage(){
		return "login.jsp";
	}

	@RequestMapping("/logout-success")
	public String handlelogoutPage(){
		return "logout.jsp";
	}
}
