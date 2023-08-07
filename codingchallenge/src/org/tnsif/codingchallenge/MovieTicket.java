package org.tnsif.codingchallenge;
import java.util.Scanner;
public class MovieTicket {

	
	public static void Test(int age, float time)
	{
		if(age>=13 && (time>=10.15 && time<=22.00))
		{
			System.out.println("$8.0");
		}
		else if(age>=13 && (time==13.30 || time==18.00 ))
		{
			System.out.println("$5.0");
		}
		else if(age<=13 && (time==10.15 || time==22.00 ))
		{
			System.out.println("$4.0");
		}
		else if(age<=13 && (time==13.30 || time==18.00 ))
		{
			System.out.println("$2.0");
		}
		else
		{
			System.out.println("Movie not available.");
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		float time=s.nextFloat();
		Test(age,time);
			
	}
}
		


