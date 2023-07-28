package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		Hdfc h=new Hdfc();
		h.setAccType("Savings Account");
		h.setAccountNo(39585308930L);
		h.setAtmCardNo(34765789384L);
		h.setPinNo(4789);
		
		//below line will call toString() method
		
		System.out.println(h);

	}

}
