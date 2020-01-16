package com.ptmd.emp;

/**
 * Person class parent class for employee and teacher
 * 
 * @author ANNI
 *
 */
public class Person {

	/**
	 * Name
	 */
	private String name;
	/**
	 * Age
	 */
	private Integer age;

	/**
	 * create object for it while set the data into name and age.
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * show the details for the person
	 */
	public void myProfession(){
		System.out.println("Name :: "+name);
		System.out.println("Age :: "+age);
	}
}
