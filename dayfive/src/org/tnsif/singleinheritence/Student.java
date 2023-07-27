package org.tnsif.singleinheritence;
//child class
public class Student extends Citizen {
	
	//private data members
	private int rollno;
	private String collegeName;
	
	//getters and setters method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	//parameterized constructor
	public Student(String city, int pincode, String area, long adhaarNo, int rollno, String collegeName) {
		super(city, pincode, area, adhaarNo);
		this.rollno=rollno;
		this.collegeName=collegeName;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
