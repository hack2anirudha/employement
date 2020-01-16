package com.ptmd.emp;

/**
 * Employee Class which extends Person
 * 
 * @author ANNI
 *
 */
public class Employee extends Person {
	
	/**
	 * Constructor to create instance for it
	 * 
	 * @param name
	 * @param age
	 */
	public Employee(String name, Integer age) {
		// create object for parent class
		super(name, age);
	}
	
	/**
	 * show my profession with current class name
	 */
	@Override
	public void myProfession(){
		// call super class method
		super.myProfession();
		System.out.println("Profession :: "+this.getClass().getSimpleName());
	}
}
