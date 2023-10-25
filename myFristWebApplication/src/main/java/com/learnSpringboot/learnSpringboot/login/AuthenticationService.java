package com.learnSpringboot.learnSpringboot.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String userName, String password) {
		boolean userNameValid = userName.equalsIgnoreCase("amAn");
		boolean passwordValid =  password.equalsIgnoreCase("RaJ");
		
		return userNameValid && passwordValid;
			
	}

}
