package org.springboot.starter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JPAController {
	
	@RequestMapping("/home")
	public String getValue(){
		return "home.jsp";
	}

}
