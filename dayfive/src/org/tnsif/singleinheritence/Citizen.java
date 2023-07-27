package org.tnsif.singleinheritence;
//base class
public class Citizen {
	//private data members
	private String city;
	private int pincode;
	private String area;
	private long adhaarNo;
	
	//getters and setters method
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdhaarNo() {
		return adhaarNo;
	}
	public void setAdhaarNo(long adhaarNo) {
		this.adhaarNo = adhaarNo;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adhaarNo=" + adhaarNo + "]";
	}
	/*
	//default constructor
	public Citizen() {
		System.out.println("Citizen-Parent Class");
	}
	*/
	//parameterized constructor
	public Citizen(String city, int pincode, String area, long adhaarNo) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adhaarNo = adhaarNo;
	}
	
	
}
