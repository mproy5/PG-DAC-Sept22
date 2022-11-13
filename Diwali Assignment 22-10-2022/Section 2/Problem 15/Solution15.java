/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q15. Java Program to Illustrate the Use of HashCode() Method.



*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution15
{
	public static void main(String args[])
	{
		Student student1 = new Student(5, "Amit", 21);
		Student student2 = new Student(7, "Mala", 20);
		
		// print the object hashcode
		System.out.println("student1: " + student1);  // student1: Student@11a3
		System.out.println("student2: " + student2);  // student2: Student@1784
	}
	
}

class Student
{
	// Data Members
	int rollNo;
	int age;
	String name;
	
	// Constructor
	public Student()
	{
		
	}
	
	public Student(int rollNo, String name, int age)
	{
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
	}
	
	
	// override HashCode() method
	public int hashCode()
	{
		// return a unique hashcode for every object
		return 43 * rollNo * age;
	}
	
	

 
}