package org.tnsif.mutlilevelinheritence;
//child class1 & parent class(B)
public class TeamLeader extends Manager {
	
	//private data members
	private String leaderName;
	private String projectName;
	
	//getters and setters method
	
	public String getLeaderName() {
		return leaderName;
	}


	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}


	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


    //parameterized constructor
	public TeamLeader(String deptName, String name, int empId, String leaderName, String projectName) {
		super(deptName, name, empId);
		this.leaderName=leaderName;
		this.projectName=projectName;
	}

	//toString() method
	@Override
	public String toString() {
		return "TeamLeader [leaderName=" + leaderName + ", projectName=" + projectName + ", toString()="
				+ super.toString() + "]";
	}

	
}
