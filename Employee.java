package com.cdac.acts.employee;

public class Employee {

	private int empid;
	private String name;
	private double salary;
	
	private static int idgenerator=1;
	
	
	public Employee() {
		
		 this.empid = 0;
		 this.name =" ";
	     this.salary = 0;
		
	}
	
	public Employee(String name,double salary) {
		
		 this.empid = idgenerator++;
		 this.name  = name;
	     this.salary = salary;
		
	}
	
	public int  getempid() {
		return this.empid;
	}
	
	public void display(){
	
	System.out.println("[  emp id =" + empid + "salary =" + salary +"name =" + name + " ]");
	
	}
	
	public void PrintAll(Employee [] e) {
		for (int i=0;i<e.length;i++) {
			for(int j=e.length+1;j<e.length-1;j++) {
			        swap(e,j,j-1);
				}
			}
		}
	
	
	public void swap(Employee [] emp,int f,int s) {
		Employee temp = emp[f];
		emp[f] = emp[s];
		emp[s] = temp;
	}
	
	
}
