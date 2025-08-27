package com.Adithiyaa.Assignment.employees;

public class Employee {
  
  private String name;
  private int employeeId;
  private double salary;
  
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public int getEmployeeId() {
	return employeeId;
  }
  public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
  }
  public double getSalary() {
	return salary;
  }
  public void setSalary(double salary) {
	this.salary = salary;
  }
  
  public void DisplayEmployeeInfo(){
	 
	  System.out.println("Employee Id : "+this.employeeId);
	  System.out.println("Employee Name : "+this.name);
	  System.out.println("Employee Salary : "+this.salary);
	
   }
  
  
  
}
