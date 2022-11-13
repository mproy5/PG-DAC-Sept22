/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q18.  Java Program to Illustrates Use of Chaining Constructor.



*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution18
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
	
	// Counstructor overloading with chaining
	Student(int rollNo)
	{  
		// Constructor chaining
		this();   // call default constructor
		
		this.rollNo = rollNo;
		
	}
	
	Student(int rollNo, String name)
	{
		this(rollNo);  // call Student(int)
		this.name = name;
		
	}
	
	Student(int rollNo, String name, double marks)
	{
		this(rollNo, name);   // call Student(int, String)
		this.marks = marks;
	}
	
	
	// Override toString() method
	public String toString()
	{
		return "Student[rollNo: " + rollNo + ", name: " + name + ", marks: " + marks + "]";
	}
	
}