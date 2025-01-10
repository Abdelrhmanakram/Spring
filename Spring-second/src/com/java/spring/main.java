package com.java.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AccountService userService = applicationContext.getBean("accountService" , AccountService.class);


		userService.getSavePerson();
	}

}
