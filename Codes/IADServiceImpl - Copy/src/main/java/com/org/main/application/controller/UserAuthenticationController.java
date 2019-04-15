package com.org.main.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserAuthenticationController {
	
	
	@RequestMapping("/authenticateuser")
	public String handleAuthenticateUser() {
		return "home.jsp";
	}

}
