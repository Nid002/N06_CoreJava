package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	
	String str;
	static float salary;
	//static block is used to initialize static variable and we can't initialize any 
	//non-static variable inside the static block
	static {
		salary=78000.78f;
		//str="Nid";
	}
	
	static void print()
	{
		System.out.println(salary);
	}
	public static void main(String[] args) {
		print();
		
		//main function is static and hence it calls static block, method & variable by default
	}

}
