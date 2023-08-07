package org.tnsif.interfacedemo;
//implementable class for Sony
public class SonyTV implements Sony {

	//provide an implementation to all the abstract method of an interface
	@Override
	public void display() {
		System.out.println("CID");
	}

	
}
