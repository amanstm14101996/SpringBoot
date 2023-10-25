package com.learnSpringboot.learnSpringboot.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	

	private AuthenticationService service;
	
	public LoginController(AuthenticationService service) {
		super();
		this.service = service;
	}

	
	@RequestMapping(value="login",method= RequestMethod.GET)
	public String gotoLoginJsp() {

		return "login";
	}
	
	@RequestMapping(value="login",method= RequestMethod.POST)
	public String gotoWelcomepage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		model.put("name", name);
		model.put("password", password);
		
		if (service.authenticate(name, password)) {
			return "welcome";
		}
			
		model.put("errorMessage","Invalid Credential ! Please try again");
		return "login";
		//Authentication
		//userName:Aman Password :Raj
		
		
	}
	

}
