//driver class
package org.tnsif.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		//object creation
		Employee e=new Employee();
		e.empID=2;
		e.empName="Nid";
		e.salary=80000;
		e.department="Comp";
		
		//method call
		e.display();
	}

}