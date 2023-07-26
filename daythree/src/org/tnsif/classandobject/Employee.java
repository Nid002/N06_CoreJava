//program to demonstrate on class & object
package org.tnsif.classandobject;
//class declaration
public class Employee {
	//default data members
	int empID;
	String empName;
	float salary;
	String department;
	
	//method declaration & definition
	void display()
	{
		System.out.println("Employee Name: "+empName+" "+"Employee ID: "+empID+" "+"Salary: "+salary+" "+"Department: "+department);
	}
}
