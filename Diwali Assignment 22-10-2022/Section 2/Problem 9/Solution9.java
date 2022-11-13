/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q9. Java Program to Implement the Passing and Returning Objects.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution9
{

	public static void main(String []args)
	{
		
		// Create object of StudentList
		StudentList studentListOfDAC = new StudentList();
		
		// Pass the Student object
		studentListOfDAC.addStudent(new Student(5, "Amit", 85.0));
		
		// Get and print the Student object
		System.out.println(studentListOfDAC.getStudent(0));  // Student[Roll No.: 5, Name: Amit, Marks: 85.0]
		
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

class StudentList
{
	ArrayList<Student> studentList = new ArrayList<>();
	
	// Add Student -> Pass object example
	public void addStudent(Student student)
	{
		studentList.add(student);
	}
	
	// Get Student Details -> Returnning Object example
	public Student getStudent(int index)
	{
		return studentList.get(index);
	}
	
	
}