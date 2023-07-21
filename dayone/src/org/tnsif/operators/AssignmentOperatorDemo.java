//program to demonstrate on assignment operator
package org.tnsif.operators;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		int num1=34;
		int num2=4;
		System.out.println(num1+=num2);
		System.out.println(num1-=num2);
		System.out.println(num1*=num2);
		System.out.println(num1/=num2);
		System.out.println(num1%=num2);
		System.out.println(num1=num2);
	}

}
