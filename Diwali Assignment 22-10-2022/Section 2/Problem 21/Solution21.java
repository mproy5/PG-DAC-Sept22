/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q21. Java Program to Allocate and Initialize Super Class Members using Constructor.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution21
{
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle(5.0, 3.0);
		
		rect.printSuper(); 
		/*
		OUTPUT:
		Length: 5.0
		Width: 3.0
		*/
	}
}

class Shape
{
	private double length;
	private double width;
	
	Shape()
	{
		
	}
	
	Shape(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	// getters
	public double getLength()
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
}

class Rectangle extends Shape
{
	// Allocate and Initialize Super Class Members using Constructor
	Rectangle()
	{
		
	}
	
	Rectangle(double length, double width)
	{
		super(length, width);
	}
	
	public void printSuper()
	{
		System.out.println("Length: " + super.getLength());
		System.out.println("Width: " + super.getWidth());
	}
}