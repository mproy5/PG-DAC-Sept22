/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q23. Java Program to Demonstrate Usage of an Instance Variable in the Test Class.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution23
{
	public static void main(String args[])
	{
		// Usage of Instance Variable
		Test test = new Test("Amit");
		
		// print Instance variable from non static method
		test.printName();  // Your Name is Amit
		
	}
}

class Test
{
	// Instance Variable
	String name;
	
	// Using Constructor we can set instance variable
	Test()
	{
		
	}
	
	Test(String name)
	{
		this.name = name;
	}
	
	// Method
	public void printName()
	{
		System.out.println("Your Name is " + name);
	}
}