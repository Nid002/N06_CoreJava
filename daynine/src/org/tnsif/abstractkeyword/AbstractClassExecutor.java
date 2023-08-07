//program to demonstrate on abstract keyword
//driver class
package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		//we can't create object for abstract class
		//Sandwich sw=new Sandwich;
		
		VegCheeseSandwich vc=new VegCheeseSandwich();
		vc.prepare();
		vc.showRecipe();
		
	}

}
