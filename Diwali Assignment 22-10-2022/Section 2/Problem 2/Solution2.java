/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q2. Java Program to Illustrates Use of Abstract Class and Method



*/

// Solution:

import java.lang.*;
import java.util.*;


public class Solution2
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
		// calling the abstract method of abstract class from its child where the abstract method is defined
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
	
	
	// abstract method -> a method which has only signature but not body
	// THIS METHOD BODY MUST DEFINE IN ALL OF ITS CHILD CLASS
	public abstract double getArea();
	
	// IF A CLASS CONTAIN ONE ABSTRACT METHOD THEN THAT CLASS WE MUST DEFINE AS AN ABSTRACT CLASS 
	
}

// Normal class extends a Abstract class
// because if we need to use that abstract class we must extend abstract class
class Rectangle extends Shape
{
	// Constructor -> to set Shape data members through Rectangle class using supr()
	public Rectangle(double length, double width)
	{
		// Using super() call we set the parent class Constructor 
		super(length, width);
	}
	
	// MUST DEFINE ABSTRACT METHOD OF THE PARENT ABSTRACT CLASS
	public double getArea()
	{
		return getLength() * getWidth();
	}
}