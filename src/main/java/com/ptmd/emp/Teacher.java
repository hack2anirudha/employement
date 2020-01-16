package com.ptmd.emp;

/**
 * Teacher Class extends Person class
 * 
 * @author ANNI
 *
 */
public class Teacher extends Person {

	/**
	 * Teacher constructor to create instance for it
	 * 
	 * @param name
	 * @param age
	 */
	public Teacher(String name, Integer age) {
		super(name, age);
	}
	
	
	/**
	 * show profession with the current class name
	 */
	@Override
	public void myProfession(){
		super.myProfession();
		System.out.println("Profession :: "+this.getClass().getSimpleName());
	}
	
}
