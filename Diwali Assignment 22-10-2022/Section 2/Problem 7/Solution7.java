/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q7. Java Program to Implement Shape Interface using Circle and Rectangle Class.


*/

// Solution:

import java.lang.*;
import java.util.*;


public class Solution7
{
	public static void main(String[] args)
	{
		// We can't create a object of Interface
		// So we create Implementing class object
		
		// Instance of Circle class
		Circle circle = new Circle(7.0);
		
		// Instance of Rectangle class
		Rectangle rect = new Rectangle(3.0, 5.0);
		
		// Calculate and Print Area  
		System.out.println("Area of Circle: " + circle.getArea());   // Area of Circle: 153.86
		System.out.println("Area of Rectangle: " + rect.getArea());  // Area of Rectangle: 15.0
		
	}
}

// Shape Interface
interface Shape
{
	// abstract method must implent by the implementing class
	double getArea();
}

class Circle implements Shape
{
	// Data Memnbers
	private double radius;
	
	// Constructor
	Circle()
	{
		
	}
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	
	// setter
	public void setShape(double radius)
	{
		this.radius = radius;
	}
	
	// Interface Method Must Define with public access modifier
	public double getArea()
	{
		return 3.14 * radius * radius;
	}
	
	
}

class Rectangle implements Shape
{
	// Data Members
	double length;
	double width;
	
	// Constructors
	Rectangle()
	{
		
	}
	
	Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	// Interface Method Must Define with public access modifier
	public double getArea()
	{
		return length * width;
	}
	
	
}