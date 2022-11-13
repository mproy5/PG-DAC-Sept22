/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q19.  Java Program to Create an Object for Class and Assign Value in the Object using
	  Constructor.

*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution19
{
	public static void main(String args[])
	{
		// Create an object and set the value using constructor
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
	
	Student(int rollNo, String name)
	{
		this.rollNo = rollNo;
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