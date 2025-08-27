package com.Adithiyaa.Assignment.employees;

public class Developer extends Employee{
	
	private int developerId;
	private String projectId;
	private int securitykey;
	
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public int getSecuritykey() {
		return securitykey;
	}
	public void setSecuritykey(int securitykey) {
		this.securitykey = securitykey;
	}
	
	public void displayManagerInfo() {
		DisplayEmployeeInfo();
		 System.out.println("Developer Id : "+this.developerId);
		 System.out.println("Project Id : "+this.projectId);
		 System.out.println("Team Available : "+this.securitykey);
		  
	}
	
	
	
}
