/* A microwave manufacturer recommend that when heating 2 items at 50% to heating time, 
 * & when heating 3 items double the heating time. Heating more than 3 items at once is
 * not recommended . Write a program to find out the recommended heating time.
 * I/P-> no. of items=2, heating time=5.0*/

package org.tnsif.codingchallenge;
import java.util.*;

public class Microwave {

	public static void main(String[] args) {

			Scanner s=new Scanner(System.in);
			System.out.println("Enter item and heating time:");
			int item=s.nextInt();
			double heatTime=s.nextDouble();
			double total;
			
			switch(item)
			{
			case 1:
				total=heatTime;
				System.out.println(total);
				break;
				
			case 2:
				total=heatTime+(heatTime/2);
				System.out.println(total);
				break;
				
			case 3:
				total=2*heatTime;
				System.out.println(total);
				break;
			
			default:
				System.out.println("Is not Recommended!");
			
			}	
}

}
