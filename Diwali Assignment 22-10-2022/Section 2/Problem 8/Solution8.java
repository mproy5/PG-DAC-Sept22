/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q8. Java Program to Count Number of Objects Created for Class.



*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution8
{
	public static void main(String[] args)
	{
		// Create first object
		Test test1 = new Test();
		
		// create second object
		Test test2 = new Test();
		
		// Print counter -> How many times object of a class instansiated
		System.out.println("Counter : " + Test.getCounter()); // Counter : 2
		
	}
}

class Test
{
	// we must take a static data member to retain the value whenever a new object created
	private static int counter = 0;
	
	// Constructor
	Test()
	{
		// Constructor must called when a new object created
		++counter;
	}
	
	// getter
	public static int getCounter()
	{
		return counter;
	}
}