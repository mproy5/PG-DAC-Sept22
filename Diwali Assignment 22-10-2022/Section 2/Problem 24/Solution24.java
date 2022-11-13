/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q24. Java Program to Demonstrate Usage of a Static Variable in the Test Class.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution24
{
	public static void main(String args[])
	{
		// Usage of a Static Variable
		Test test = new Test();
		
		// print static variable
		test.printClass();    // Class is Test
	}
}

class Test
{
	// Static variable
	static String className = "Test";


	// Method
	public void printClass()
	{
		System.out.println("Class is " + className);
	}
	
}