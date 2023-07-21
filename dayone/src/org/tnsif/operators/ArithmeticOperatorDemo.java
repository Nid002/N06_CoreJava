//program to demonstrate on arithmetic operators
package org.tnsif.operators;

import java.util.Scanner;

public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=s.nextInt();
		System.out.println("Enter second number: ");
		int num2=s.nextInt();
		
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
	}

}
