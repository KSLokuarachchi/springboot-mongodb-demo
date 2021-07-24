package com.tutorial.mongodbdemo.test;

public class Manager {

	public static void main(String[] args) {

		Engineer comp = new ComputerEngineer();
		comp.setType("Computer Engineer");
		comp.setSalary(50000);
		comp.setMileStone(new ComputerMileStone());

		
		System.out.println(comp);
		System.out.println("********************");
	}

}
