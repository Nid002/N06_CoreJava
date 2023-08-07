package org.tnsif.finalkeyword;

public class HP extends Laptop {
	final String processor="Intel i7";
	//final method
	//we can't override final method
//	void display()         //overriding
//	{
//		
//		System.out.println(processor);
//	}
	//overloading
	void display(String processor)
	{
		System.out.println(processor);
}

}
