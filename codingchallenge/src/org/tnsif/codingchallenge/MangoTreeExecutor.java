/* Darshan is very much interested in gardening and hence he plants more trees in his garden.
 * He plants trees in a rectangular fashion with the order of rows and columns & numbers the
 * trees in a row-wise order. He planted the mango tree only in the first row first column & 
 * last column. So given the tree number(t) & row & column number(n) your task is to find out 
 * whether the given tree is a mango tree or not. */
package org.tnsif.codingchallenge;
import java.util.Scanner;
public class MangoTreeExecutor {

	static void isMangoTree(int n, int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
			System.out.println("Mango Tree");
		else
			System.out.println("Not a Mango Tree");
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of n & t: ");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);

	}

}