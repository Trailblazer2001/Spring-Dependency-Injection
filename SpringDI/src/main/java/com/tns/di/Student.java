package com.tns.di;

public class Student 
{	
	private String studentName;
	private int id;
	//Using Setter
	/*
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public void setStudentName(String studentName) { this.studentName =
	 * studentName; }
	 */
	//Using Constructor
	public Student(String studentName, int id) 
	{
		
		this.studentName = studentName;
		this.id = id;
	}
	public void disp()
	{
		System.out.println("Student name is : " +studentName + " and id is " +id);
	}

	
}
	

