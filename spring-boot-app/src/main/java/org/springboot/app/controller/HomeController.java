package org.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String launchindex(){
		return "index";
		
	}
	
	@RequestMapping("/next")
	public String launchNextPage(){
		return "next";
		
	}
}
