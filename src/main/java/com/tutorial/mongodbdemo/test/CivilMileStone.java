package com.tutorial.mongodbdemo.test;

public class CivilMileStone implements MileStone {

    @Override
    public String work() {
        // TODO Auto-generated method stub
        return "Create  Twin Towers";
    }

    @Override
    public String target() {
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
        return "Has to be completed in 2 years";
    }

    @Override
    public String toString() {
        return "CivilMileStone [work()=" + work() + ", target()=" + target()
        + "]";
    }

	@Override
	public void rest() {
	}
    
    
}
