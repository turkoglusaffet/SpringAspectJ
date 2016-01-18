package spring.aop.person.bo.impl;

import spring.aop.person.bo.PersonBo;

public class PersonBoImpl implements PersonBo{

	public void addPerson() {
		System.out.println("addPerson() is running");
		
	}

	public String addPersonReturnValue() {
		System.out.println("addPersonReturnValue() is running ");
		return "x";
	}

	public void addPersonThrowException() throws Exception {
		System.out.println("addPersonThrowException is running ");
		throw new Exception("Error");
	}

	public void addPersonAround(String name) {
		System.out.println("addPersonAround() is running , args : "+ name);
		
	}

}
