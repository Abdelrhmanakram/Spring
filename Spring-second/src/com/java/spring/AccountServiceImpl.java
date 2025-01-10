package com.java.spring;

import org.springframework.stereotype.Component;

@Component
public class AccountServiceImpl implements AccountService{

	private UserService userService ;
	
	 AccountServiceImpl( UserService userService) {
		this.userService=userService;
	}

	@Override
	public void getSavePerson() {
		// TODO Auto-generated method stub
		userService.save("Abdo");
	}

}
