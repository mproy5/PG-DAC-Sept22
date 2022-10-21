/* 

MODULE 2 OOPJ : ASSIGNMENT 3

Q3. Implement a class for a Person. Person has data members age, weight, height, dateOfBirth, 
address with proper reader/write methods etc. Now create two subclasses Employee and Student. 
Employee will have additional data member salary, dateOfJoining, experience etc. Student has data 
members roll, listOfSubjects, their marks and methods calculateGrade. Again create two sub-classes 
Technician and Professor from Employee. Professor has data members courses, listOfAdvisee and 
their add/remove methods. Write a main() function to demonstrate the creation of objects of different 
classes and their method calls. 
 



Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/

import java.lang.*;
import java.util.*;


public class Solution3
{
	public static void main(String args[])
	{
		// Create Student
		Student stud1 = new Student("Amit", 21, 73.0, 5.6, "04/05/1999", "Mumbai", 4);
		stud1.addSubjectAndMark("Mathematics", 85.0);
		stud1.addSubjectAndMark("English", 75.0);
		
		// Print student
		stud1.printDetails();
		
		
		// Create Proffessor
		Proffessor prof1 = new Proffessor();
		prof1.setProfessor("Murti", 40, 65.0, 5.8, "16/09/1982", "Delhi", 65000.0, "21/06/2005", "Lecturer for 10 years");
		
		// add
		prof1.addCourse(4, "Mathematics");
		prof1.addCourse(7, "Physics");
		prof1.addCourse(9, "Computer Science");
		
		prof1.addAdvisee(4567, "Mala");
		prof1.addAdvisee(3027, "Rahul");
		prof1.addAdvisee(5612, "Pran");
		
		// Before Remove
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("BEFORE REMOVE -->");
		prof1.printDetails();
		
		// Remove
		prof1.removeCourse(9);
		prof1.removeAdvisee(3027);
		
		// After Remove
		System.out.println("-----------------------------------------------------");
		System.out.println();
		System.out.println("AFTER REMOVE -->");
		prof1.printDetails();	
		
	}
}

// PERSON CLASS
class Person
{
	// Data Members
	private String name;
	private int age;
	private double weight;
	private double height;
	private String dateOfBirth;
	private String address;
	
	// Constructors()
	Person()
	{
		
	}
	
	Person(String name, int age, double weight, double height, String dateOfBirth, String address)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	
	// Stter
	public void setPerson(String name, int age, double weight, double height, String dateOfBirth, String address)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
	}
	
	// Reader methods
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public double getHeight()
	{
		return height;
	}	
	
	public String getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	
	
}

// EMPLOYEE CLASS
class Employee extends Person
{
	// Data members
	private double salary;
	private String dateOfJoining;
	private String experience;
	
	// Constructors
	Employee()
	{
		
	}
	
	// Setters
	public void setEmployee(String name, int age, double weight, double height, String dateOfBirth, String address, double salary, String dateOfJoining, String experience)
	{
		super.setPerson(name, age, weight, height, dateOfBirth, address);
		this.salary = salary;
		this.dateOfJoining = dateOfJoining;
		this.experience = experience;
	}
	
	
	// Getter
	public double getSalary()
	{
		return salary;
	}
	
	public String getDateOfJoining()
	{
		return dateOfJoining;
	}
	
	public String getExperience()
	{
		return experience;
	}
	
	
	
}

// STUDENT CLASS
class Student extends Person
{
	// Data Members
	int roll;
	ArrayList<String> listOfSubjects = new ArrayList<>(); 
	ArrayList<Double> marks = new ArrayList<>(); 
	
	// Constructors
	Student()
	{
		
	}
	
	Student(String name, int age, double weight, double height, String dateOfBirth, String address, int roll)
	{
		super(name, age, weight, height, dateOfBirth, address);
		this.roll = roll;
	}
	
	// Method to add Subject and marks
	public void addSubjectAndMark(String subject, double mark)
	{
		listOfSubjects.add(subject);
		marks.add(mark);
	}
	
	// methods calculateGrade
	
	public double calculateGrade()
	{
		int totMarks = 0;
		double avg;
		
		// Iterate and add 
		for (Double mark : marks)
		{
			totMarks += mark;
		}
		
		avg = totMarks / marks.size();
		return avg;
		
	}
	
	public void printDetails()
	{
		System.out.println("Designation: Student");
		System.out.println("Name: " + super.getName());
		System.out.println("Age: " + super.getAge());
		System.out.println("Weight: " + super.getWeight());
		System.out.println("Height: " + super.getHeight());
		System.out.println("Birth Date: " + super.getDateOfBirth());
		System.out.println("Address: " + super.getAddress());
		System.out.println("Roll: " + roll);
		System.out.println("Subjects: " + listOfSubjects.toString());
		System.out.println("Name: " + marks.toString());
		System.out.println("Grade: " + calculateGrade());
		System.out.println();
		
		
	}
}

// TECHNICIAN CLASS
class Technician extends Employee
{
	String id = "NA";
	String category;
	
	// Constructors
	Technician()
	{
		
	}
	
	Technician(String category)
	{
		this.category = category;
	}
}

// PROFESSOR CLASS
class Proffessor extends Employee
{
	// data members
	HashMap<Integer, String> courses = new HashMap<>(); 
	HashMap<Integer, String> listOfAdvisee = new HashMap<>();
	
	// setter
	public void setProfessor(String name, int age, double weight, double height, String dateOfBirth, String address, double salary, String dateOfJoining, String experience)
	{
		super.setEmployee(name, age, weight, height, dateOfBirth, address, salary, dateOfBirth, experience);
	}

	// their add/remove methods
	public void addCourse(int courseId, String course)
	{
		courses.put(courseId, course);
	}
	
	public void addAdvisee(int adviseeId, String name)
	{
		listOfAdvisee.put(adviseeId, name);
	}
	
	public void removeCourse(int courseId)
	{
		courses.remove(courseId);
	}
	
	public void removeAdvisee(int adviseeId)
	{
		listOfAdvisee.remove(adviseeId);
	}
	
	public void printDetails()
	{
		System.out.println("Designation: Professor");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Weight: " + getWeight());
		System.out.println("Height: " + getHeight());
		System.out.println("Birth Date: " + getDateOfBirth());
		System.out.println("Address: " + getAddress());
		System.out.println("Salary: " + getSalary());
		System.out.println("Joining Date: " + getDateOfJoining());
		System.out.println("Experience: " + getExperience());
		System.out.println("Courses: " + courses.toString());
		System.out.println("Advisee: " + listOfAdvisee.toString());
		System.out.println();
	}
	
}

/*
OUTPUT:

Designation: Student
Name: Amit
Age: 21
Weight: 73.0
Height: 5.6
Birth Date: 04/05/1999
Address: Mumbai
Roll: 4
Subjects: [Mathematics, English]
Name: [85.0, 75.0]
Grade: 80.0

-----------------------------------------------------

BEFORE REMOVE -->
Designation: Professor
Name: Murti
Age: 40
Weight: 65.0
Height: 5.8
Birth Date: 16/09/1982
Address: Delhi
Salary: 65000.0
Joining Date: 16/09/1982
Experience: Lecturer for 10 years
Courses: {4=Mathematics, 7=Physics, 9=Computer Science}
Advisee: {3027=Rahul, 4567=Mala, 5612=Pran}

-----------------------------------------------------

AFTER REMOVE -->
Designation: Professor
Name: Murti
Age: 40
Weight: 65.0
Height: 5.8
Birth Date: 16/09/1982
Address: Delhi
Salary: 65000.0
Joining Date: 16/09/1982
Experience: Lecturer for 10 years
Courses: {4=Mathematics, 7=Physics}
Advisee: {4567=Mala, 5612=Pran}

*/