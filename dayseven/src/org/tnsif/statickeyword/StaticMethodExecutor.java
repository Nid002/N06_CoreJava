//program to demonstrate on static method
package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	
	//static method
	/*if any method outside the main function & if you want to access that method inside the
	 * main function, make it static*/
	
	static float percentage=78.6f;
	
	static void displayScore(int score)
	{
		System.out.println(percentage);
		System.out.println("Score  is: "+score);
	}
	
	public static void main(String[] args) {
		displayScore(56);
		//we can't use non-static variable inside static method
		
	}

}
