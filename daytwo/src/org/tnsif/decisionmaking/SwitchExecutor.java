package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the song no: ");
		int songno=s.nextInt();
		switch(songno)
		{
		case 1:
			System.out.println("Love Like This");
			break;
		
		case 2:
			System.out.println("Vibez");
			break;
		
		case 3:
			System.out.println("Let me");
			break;
		default:
			System.out.println("Wrong song number!!! Please check!!!");
		}
	}

}
