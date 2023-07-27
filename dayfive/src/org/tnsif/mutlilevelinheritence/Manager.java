package org.tnsif.mutlilevelinheritence;
//parent class(A)
public class Manager {
	
	//private data members
	private String deptName;
	private String name;
	private int empId;
	
	//getters and setters method
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	//toString() method
	@Override
	public String toString() {
		return "Manager [deptName=" + deptName + ", name=" + name + ", empId=" + empId + "]";
	}
	
	//parameterized constructor
	public Manager(String deptName, String name, int empId) {
		super();
		this.deptName = deptName;
		this.name = name;
		this.empId = empId;
	}
	
	
	
	
}
