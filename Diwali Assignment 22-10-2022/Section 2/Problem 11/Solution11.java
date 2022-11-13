/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q11. Java Program to Illustrate Use of Methods in a Class.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution11
{
	public static void main(String args[])
	{
		// Create object
		MathOperation mo = new MathOperation();
		
		// Method call from object of a class
		double result = mo.addition(2.0, 5.0);
		
		// Print the result
		System.out.println("Addition: " + result);  // Addition: 7.0
		
	}
}


class MathOperation
{
	// Method to calculate addition
	// Parameters ---> x and y
	// Parameter type ----> double, double
	// Return type ----> double
	public double addition(double x, double y)
	{
		return x + y;
	}
}