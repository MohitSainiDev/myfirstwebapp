package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

	boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("in28minutes");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");

		return isValidUserName && isValidPassword;
	}

}