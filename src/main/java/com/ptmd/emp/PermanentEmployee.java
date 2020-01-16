package com.ptmd.emp;

/**
 * permanent employee class extends from employee
 * 
 * @author ANNI
 *
 */
public class PermanentEmployee extends Employee{

	/**
	 * Constructor for create instance for it
	 * 
	 * @param name
	 * @param age
	 */
	public PermanentEmployee(String name, Integer age) {
		// create object for parent class
		super(name, age);
	}
	
	/**
	 * show my profession details.
	 */
	@Override
	public void myProfession(){
		// call parent class method
		super.myProfession();
	}

}
