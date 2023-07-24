package org.tnsif.decisionmaking;
import java.util.Scanner;
public class NestedIfExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=s.nextInt();
		System.out.println("Enter your weight: ");
		int weight=s.nextInt();
		if(age>12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for bunjee jumping");
				if(weight>110)
				{
					System.out.println("Add extra ropes");
				}
			}
			else
			{
				System.out.println("Not eligible for unjee jumping");
			}
		}
		else
		{
			System.out.println("Not eligible for unjee jumping");
		}
	}

}
