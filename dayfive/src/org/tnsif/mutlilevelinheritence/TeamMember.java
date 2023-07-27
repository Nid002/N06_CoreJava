package org.tnsif.mutlilevelinheritence;

public class TeamMember extends TeamLeader {
	
	//private data members
	private int size;
	private int duration;
	
	//getters and setters method
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}


	//parameterized constructor
	public TeamMember(String deptName, String name, int empId, String leaderName, String projectName, int size, int duration) {
		super(deptName, name, empId, leaderName, projectName);
		this.size=size;
		this.duration=duration;
	}


	//toString() method
	
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}

	
	
}
