package org.tnsif.polymorphism;
class ChiefMinister
{
	static void corruption(String str1, float amt1)
	{
		System.out.println(str1+" corrupted the amount of "+amt1);
	}
	
}
class MLA extends ChiefMinister
{
	
	static void corruption(String str2, float amt2)
	{
		ChiefMinister.corruption("Ajit Pawar", 567897.98f);
		System.out.println(str2+" corrupted the amount of "+amt2);
	}
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		MLA.corruption("Banwarilal Purohit", 887374.48f);
		
	}

}
