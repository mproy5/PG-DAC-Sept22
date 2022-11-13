/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q16.  Java Program to Illustrate Use of Final Keyword.

Author: Mahendra Pratap Roy

*/

// Solution:

import java.lang.*;
import java.util.*;


public class Solution16
{
	public static void main(String args[])
	{
		Circle circle = new Circle();
		circle.setCircle(5.0);
		
		// circle.PI = 2.1;  // error: cannot assign a value to final variable PI
		
		System.out.println("Area: " + circle.getArea());  // Area: 78.5
	}
}

// If we use final keyword before class then we can not extend the class
final class Circle
{
	// Data members
	double radius;
	// If we use final keyword before variable we can not modify it from anywhere
	final double PI = 3.14;
	
	// setter
	public void setCircle(double radius)
	{
		this.radius = radius;
	}
	
	// getter
	// If we use final keyword before method then we can not override it
	final public double getArea()
	{
		return PI * radius * radius;
	}
	
}