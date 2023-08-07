//Program to demonstrate on final variable
package org.tnsif.finalkeyword;

public class FinalVariable {
	//final variable must be initialized during declaration
	//final int x;
	
	final float SALARY=67000.67f;
	
	void print() 
	{
		//We can't change the value of final variable
		//SALARY=89000.89f;
		System.out.println("Salary is: "+SALARY);
	}
}
