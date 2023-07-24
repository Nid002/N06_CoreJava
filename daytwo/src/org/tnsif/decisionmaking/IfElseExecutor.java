package org.tnsif.decisionmaking;
import java.util.Scanner;
public class IfElseExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		System.out.println("Enter your weight: ");
		int weight=s.nextInt();
		
		if(age>18 && weight>50) {
			System.out.println("Eligible to donate the blood");
		}
		else
		{
			System.out.println("Not eligible");
		}

	}

}
