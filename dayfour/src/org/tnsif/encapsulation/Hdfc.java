//program to demonstrate on encapsulation
/* encapsulation achieves a data hiding using private access specifier*/
package org.tnsif.encapsulation;

public class Hdfc {
	//private data members
	private long accountNo;
	private String accType;
	private long atmCardNo;
	private int pinNo;
	
	//setters and getters method to access private data members 
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getAtmCardNo() {
		return atmCardNo;
	}
	public void setAtmCardNo(long atmCardNo) {
		this.atmCardNo = atmCardNo;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	
	//toString() method - to print the object
	@Override
	public String toString() {
		return "Hdfc [accountNo=" + accountNo + ", accType=" + accType + ", atmCardNo=" + atmCardNo + ", pinNo=" + pinNo
				+ ", getAccountNo()=" + getAccountNo() + ", getAccType()=" + getAccType() + ", getAtmCardNo()="
				+ getAtmCardNo() + ", getPinNo()=" + getPinNo() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	 
	
}
