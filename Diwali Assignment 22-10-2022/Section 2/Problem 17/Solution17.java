/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q17.  Java Program to Illustrate Use of Constructor.



*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution17
{
	public static void main(String args[])
	{
		
		// Default Constructor call
		Student studentDefault = new Student();
		System.out.println(studentDefault);         	  //  Student[rollNo: 0, name: null, marks: 0.0]
		
		// Overloaded Constructors call
		Student student1 = new Student(5, "Amit");
		System.out.println(student1);                    //  Student[rollNo: 5, name: Amit, marks: 0.0]
		
		Student student2 = new Student(7);
		System.out.println(student2);   			     //  Student[rollNo: 7, name: null, marks: 0.0]
		
		Student student3 = new Student(2, "Mala", 85.0);
		System.out.println(student3);                   //  Student[rollNo: 2, name: Mala, marks: 85.0]
		
	}
}

class Student
{
	int rollNo;
	String name;
	double marks;
	
	// Default Constructor
	Student()
	{
		
	}
	
	// Counstructor overloading
	Student(int rollNo)
	{
		this.rollNo = rollNo;
		name = null;
		marks = 0.0;
	}
	
	Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
		marks = 0.0;
	}
	
	Student(int rollNo, String name, double marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	
	// Override toString() method
	public String toString()
	{
		return "Student[rollNo: " + rollNo + ", name: " + name + ", marks: " + marks + "]";
	}
	
}