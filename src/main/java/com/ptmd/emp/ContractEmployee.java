package com.ptmd.emp;

/**
 * contract employee
 * 
 * @author ANNI
 *
 */
public class ContractEmployee extends Employee {

	/**
	 * create instance for the contract Employee
	 * 
	 * @param name
	 * @param age
	 */
	public ContractEmployee(String name, Integer age) {
		// create object for parent class
		super(name, age);
	}

	/**
	 * show my profession details.
	 */
	@Override
	public void myProfession() {
		// call parent class method
		super.myProfession();
	}
}
