package com.java.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SchoolService userService = applicationContext.getBean("schoolService" , SchoolService.class);


		
		userService.run();
	}

}
