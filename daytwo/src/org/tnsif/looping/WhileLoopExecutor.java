package org.tnsif.looping;
import java.util.Scanner;
public class WhileLoopExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		while(num>=1)    //printing num to 1
		{
			System.out.print(num+" ");
			num--;
		}
	}

}
