package com.tutorial.mongodbdemo.test;

public class ComputerEngineer implements Engineer{

	private String type;
	private int salary;
	private MileStone mileStone;

	public void setType(String type) {
		this.type = type;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void setMileStone(MileStone mileStone) {
		this.mileStone = mileStone;
	}

	@Override
	public void setPersonalDetails() {
	}

	@Override
	public String getType() {
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		System.out.println("test line");
		return type;
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return salary;
	}

	@Override
	public MileStone getMileStone() {
		// TODO Auto-generated method stub
		return mileStone;
	}

	@Override
	public String toString() {
		return "ComputerEngineer [type=" + type + ", salary=" + salary + ", mileStone=" + mileStone + "]";
	}

}
