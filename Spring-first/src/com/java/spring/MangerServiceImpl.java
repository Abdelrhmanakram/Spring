package com.java.spring;

public class MangerServiceImpl implements UserService{

	@Override
	public void save(String name) {
		 System.out.println("Manager with name " + name + " has been saved.");
	}

	@Override
	public void update(String name) {
		 System.out.println("Manager with name " + name + " has been updated.");
	}

}
