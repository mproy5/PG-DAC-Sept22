/* 

MODULE 2 OOPJ : ASSIGNMENT 2 

Q6. Write a class Box that with three member-variables height, width and breadth. Write suitable 
constructors to initialize them. Add functions like getVolume and getArea that will return volume and surface 
area respectively. Instantiate two arbitrary boxes and then print their volume and surface area.  

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/

import java.lang.*;
import java.util.*;


public class Solution6
{
	public static void main(String args[])
	{
		// Instantiate two boxes
		Box box1 = new Box();
		Box box2 = new Box();
		
		// set value
		box1.setBox(2.0, 4.0, 3.0);
		box2.setBox(3.0, 5.0, 7.0);
		
		// Print Volume
		System.out.println("Volume of box1: " + box1.getVolume());
		System.out.println("Volume of box2: " + box2.getVolume());
		
		// Print Surface Area
		System.out.println("Surface Area of box1: " + box1.getSurfaceArea());
		System.out.println("Surface Area of box2: " + box2.getSurfaceArea());
		
		/*
		OUTPUT:
		
		Volume of box1: 24.0
		Volume of box2: 105.0
		Surface Area of box1: 26.0
		Surface Area of box2: 71.0
		*/
		
	}
}

class Box
{
	// Data members
	private double height;
	private double width;
	private double breadth;
	
	// setters
	void setBox(double height, double width, double breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	
	// Methods
	
	// Calculate volume
	double getVolume()
	{
		return height * width * breadth;
	}
	
	// Calculate total surface area
	double getSurfaceArea()
	{
		return (height * width) + (width * breadth) + (height * breadth);
	}
	
	
}
