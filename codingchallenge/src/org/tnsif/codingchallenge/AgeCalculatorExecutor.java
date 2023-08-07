/* Ask a user for their birth year encoded as two digits(like "03") & for the current year 
 * also encode it as two digits (like "23"). Write a program to find the user's current age 
 * in years. */

package org.tnsif.codingchallenge;
import java.util.Scanner;
public class AgeCalculatorExecutor {

	static void ageCalculator(int by, int cy)
	{
		if(by>cy)
			System.out.println(cy-by);
		else
			System.out.println((100-by)+cy);
	}
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter birth & current year: ");
		int by=s.nextInt();
		int cy=s.nextInt();
		ageCalculator(by,cy);
	}

}
