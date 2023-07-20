//program to demonstrate on user-input value
package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		//String str1=s.next();       ...only print first word
		String str1=s.nextLine();     //print whole string
		System.out.println("String is: "+str1);
		s.close();
		}
}


