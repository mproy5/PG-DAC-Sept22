/* 

MODULE 2 OOPJ : ASSIGNMENT 2 

Q5. Write a program to implement a class student with the following members. Name of the student. Marks of the 
student obtained in three subjects. Function to assign initial values. Function to compute total average. Function to 
display the student’s name and the total marks. Write an appropriate main() function to demonstrate the functioning 
of the above. 

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/


import java.lang.*;
import java.util.*;


public class Solution5
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Input from user
		System.out.print("Enter Student Name: ");
		String name = sc.next();
		System.out.print("Enter History Marks: ");
		double marksOfHistory = sc.nextDouble();
		System.out.print("Enter English Marks: ");
		double marksOfEnglish = sc.nextDouble();
		System.out.print("Enter Mathematics Marks: ");
		double marksOfMath = sc.nextDouble();
		
		
		// Instance of Student object
		Student student = new Student();
		// set values
		student.setStudent(name, marksOfHistory, marksOfEnglish, marksOfMath);
		
		// Fetch average marks from class Student
		double average = student.totAverage();
		// Fetch total marks from class Student
		double totalMarks = student.totMarks();
		
		// Print Results
		System.out.println("-------------------------------------------------------");
		// Fetch Name from class Student and print
		System.out.println("Name: " + student.getName());
		System.out.printf("Total Marks: %.2f \n", totalMarks);
		System.out.printf("Average Marks: %.2f \n", average);
		
		
		
		
	}
}

class Student
{
	// Data Members
	private String name;
	private double marksOfHistory;
	private double marksOfEnglish;
	private double marksOfMath;
	
	
	// Methods
	
	// Setter
	void setStudent(String name, double marksOfHistory, double marksOfEnglish, double marksOfMath)
	{
		this.name = name;
		this.marksOfHistory = marksOfHistory;
		this.marksOfEnglish = marksOfEnglish;
		this.marksOfMath = marksOfMath;
	}
	
	// Getter
	String getName()
	{
		return this.name;
	}
	
	
	// Calculate average
	
	double totAverage()
	{
		return (this.marksOfHistory + this.marksOfEnglish + this.marksOfMath) / 3;
	}
	
	// Calculate total marks
	double totMarks()
	{
		return this.marksOfHistory + this.marksOfEnglish + this.marksOfMath;
	}
	
}