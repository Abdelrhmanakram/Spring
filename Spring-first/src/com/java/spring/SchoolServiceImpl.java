package com.java.spring;

public class SchoolServiceImpl implements SchoolService{

	private UserService userService ;
	
	 SchoolServiceImpl( UserService userService) {
		this.userService=userService;
	}
	 
	@Override
	public void run() {
		userService.save("Abdo");
		userService.update("AbdoAkram");
	}

}
