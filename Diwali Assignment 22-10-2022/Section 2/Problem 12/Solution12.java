/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q12. Java Program to Create a Method without Parameters and with Return Type.


*/

// Solution:

import java.lang.*;
import java.util.*;


public class Solution12
{
	public static void main(String args[])
	{
		Circle circle = new Circle(5.0);
		
		// Method call without parameter
		double area = circle.getArea();
		
		System.out.println("Area: " + area);   // Area: 78.5
		
	}
}

class Circle
{
	// Data Members
	double radius;
	
	// Constructor
	public Circle()
	{
		
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	// Method without Parameters and with Return Type
	public double getArea()
	{
		return 3.14 * radius * radius;
	}
}