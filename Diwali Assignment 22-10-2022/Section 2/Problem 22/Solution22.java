/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q22. Java Program to Check the Accessibility of Static and Non-Static Variable by a Static Method.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution22
{
	public static void main(String args[])
	{
		// Call Static method
		Car.printType();          // Type: car
	}
}

class Car
{
	// Static data members
	static String type = "car";
	
	// Non Static data members
	String modelNo;
	double price;
	String brand;
	
	// Constructor
	Car()
	{
		
	}
	
	Car(String modelNo, double price, String brand)
	{
		this.modelNo = modelNo;
		this.price = price;
		this.brand = brand;
	}
	
    // Static method
	public static void printType()
	{
		// Inside static method we only can use Static Variable
		System.out.println("Type: " + type);
	}
	
}