package com.java.spring;

import org.springframework.stereotype.Component;

@Component
public class PersonServiceImpl implements UserService {

	@Override
	public void save(String name) {
		 System.out.println("Person with name " + name + " has been saved.");
	}

	@Override
	public void update(String name) {
		 System.out.println("Person with name " + name + " has been updated.");
	}

	

}
