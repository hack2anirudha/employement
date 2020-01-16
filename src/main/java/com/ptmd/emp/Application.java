package com.ptmd.emp;

/**
 * Application which is executable java class
 * 
 * @author ANNI
 *
 */
public class Application {
	
	/**
	 * main method to start the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		// create object for contract employee
		ContractEmployee cEmp=new ContractEmployee("Gautam", 27);
		// show profession
		cEmp.myProfession();
				
		// create object for permanent employee
		PermanentEmployee pEmp=new PermanentEmployee("Jagadish", 22);
		// show profession
		pEmp.myProfession();
		
		// create object for teacher
		Teacher teacher=new Teacher("Trupti", 24);
		// show profession
		teacher.myProfession();
		
	}
}
