//program to demonstrate on interface

package org.tnsif.interfacedemo;

public interface Sony {
	//By default all the variables inside interface is public static final 
	int noOfChannels=8;
	//by default all method inside an interface is abstract method
	void display();
	
	//Core Java 8 version provides static and default method
	//static method
	static void accept()
	{
		System.out.println("Static Method");
	}
	
	//default method
	default void show()
	{
		System.out.println("Default Method");
	}
	
	
}
