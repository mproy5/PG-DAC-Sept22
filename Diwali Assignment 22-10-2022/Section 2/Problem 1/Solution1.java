/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q1.Java Program to Illustrate Use of All Features of Abstract Class.



*/

// Solution:

import java.lang.*;
import java.util.*;


public class Solution1
{
	public static void main(String[] args)
	{
		// Abstract class can not has an Object of its own
		// Shape shape = new Shape(4.0, 5.0); // error: Shape is abstract; cannot be instantiated
		
		// Instansiate child class of an abstract class -> that is possible
		Rectangle rect = new Rectangle(4.0, 5.0); // here using child class we set the vlaue on abstract class
		
		// call abstract class method from child class
		System.out.println("Shape Lenghth: " + rect.getLength());  // Shape Lenghth: 4.0
		System.out.println("Shape Width: " + rect.getWidth());     // Shape Width: 5.0
		
		
		// Print the area of Rectangle
		System.out.println("Area: " + rect.getArea());   // Area: 20.0
		
		
	}
}

// Create a abstract class using keyword -> abstract
abstract class Shape
{	
	// Data Members 
	private double length;
	private double width;
	
	// Constructor -> abstract class can has constructor also
	public Shape()
	{
		
	}
	
	public Shape(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	// Concrete Method -> A method which has body/block
	// getters
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	// ABSTRACT CLASS CAN OR CAN NOT HAS AN ABSTRACT METHOD
	// So in this illustration we don't include the abstract method
	
}

// Normal class extends a Abstract class
// because if we need to use that abstract class we must extend abstract class
class Rectangle extends Shape
{
	// Constructor -> to set Shape data members through Rectangle class using supr()
	public Rectangle()
	{
		
	}
	public Rectangle(double length, double width)
	{
		// Using super() call we set the parent class Constructor 
		super(length, width);
	}
	
	// getters
	public double getArea()
	{
		return getLength() * getWidth();
	}
}