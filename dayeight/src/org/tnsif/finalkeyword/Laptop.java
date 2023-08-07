//program to demonstrate on final method
//parent class
package org.tnsif.finalkeyword;
//final class can't be inherited
//public final class Laptop
public class Laptop {
	final String processor="Intel i5";
	//final method
	final void display()
	{
		
		System.out.println(processor);
	}
}
