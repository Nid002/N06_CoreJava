/*Write a program to calculate tariff(budget). 
The room rent is 20% high in peak season(April to June and November to December).
 I/P-> no. of months=3, rent=1500/day, day=2 */
package org.tnsif.codingchallenge;
import java.util.*;
public class HotelTarrif {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int month, rent,day, total,total1;
		
		System.out.println("Enter month No. rent and days:");
		month=s.nextInt();
		rent=s.nextInt();
		day=s.nextInt();
		
		switch(month)
		{
		
		case 1:
		case 2:
		case 3:
		case 7:
		case 8:
		case 9:
		case 10:
			total=rent*day;
			System.out.println(total);
			break;
			
		case 4:
		case 5:
		case 6:
			
		case 11:
			
		case 12:
			total1=rent*20/100;
			total=rent*day+total1;
			System.out.println(total);
			break;
		
		default:
			System.out.println("Invalid Output!");
			
			
			
			
			
		}
		
		
		
	}

}