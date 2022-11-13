/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q10. Java Program to Swap Objects using Swap() Method.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution10
{
	// Swap objects
	static List swap(List list, int index1, int index2)
	{
		// Temp object
		Object obj = new Object();
		
		// swap process
		obj = list.get(index1);
		list.set(index1, list.get(index2));
		list.set(index2, obj);
		
		return list;
	}
	
	
	public static void main(String []args)
	{
		
		LinkedList<Student> listOfStudent = new LinkedList<>();
		
		listOfStudent.add(new Student(7, "Amit", 78.0));
		listOfStudent.add(new Student(3, "Ram", 81.0));
		listOfStudent.add(new Student(5, "Mala", 68.0));
		
	
		System.out.println("Before Swap ---> ");
		for (Student stud : listOfStudent)
			System.out.println(stud);
		
		
		// call swap()
		listOfStudent = (LinkedList)swap(listOfStudent, 0, 2);
		
		System.out.println("After Swap ---> ");
		for (Student stud : listOfStudent)
			System.out.println(stud);
		
	}
}

class Student
{
	// Data Members
	int rollNo;
	String name;
	double marks;
	
	// Constructor
	public Student()
	{
		
	}
	
	public Student(int rollNo, String name, double marks)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	
	// Override toString()
	public String toString()
	{
		return "Student[Roll No.: " + rollNo + ", Name: " + name + ", Marks: " + marks + "]";
	}
	
	
}

/*
OUTPUT:

Before Swap --->
Student[Roll No.: 7, Name: Amit, Marks: 78.0]
Student[Roll No.: 3, Name: Ram, Marks: 81.0]
Student[Roll No.: 5, Name: Mala, Marks: 68.0]
After Swap --->
Student[Roll No.: 5, Name: Mala, Marks: 68.0]
Student[Roll No.: 3, Name: Ram, Marks: 81.0]
Student[Roll No.: 7, Name: Amit, Marks: 78.0]

*/