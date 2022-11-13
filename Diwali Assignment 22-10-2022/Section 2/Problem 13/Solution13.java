/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q13. Java Program to Create a Method without Parameters and Return Type.



*/

// Solution:

import java.lang.*;
import java.util.*;


public class Solution13
{
	public static void main(String args[])
	{
		Rectangle rect  = new Rectangle(5.0, 3.0);
		
		// Method call
		rect.printDetails();   // Rectangle[length: 5.0, width: 3.0]
	}
}

class Rectangle
{
	// Data Members
	double length;
	double width;
	
	// Constructor
	public Rectangle()
	{
		
	}
	
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	
	// Method without Parameters and Return Type
	// In Java if a method not return anything we use the keyword -> void
	public void printDetails()
	{
		System.out.println("Rectangle[length: " + length + ", width: "  + width + "]");
	}
}