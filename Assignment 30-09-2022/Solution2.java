/*
* Q02.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
* Then calculate and print the area and circumference of the circle.
*/


// Author  : Mahendra Pratap Roy
// PRN No. : 220940320060

// Import r
import java.util.*;


class Circle 
{   
	// Instance Variable 
	double radius;
	double circumference;
	double area;
	
	
	// Methods
	
	// Calculate Circumference
	double circumFunc(double r)
	{
		return this.circumference = 2*Math.PI*r;
	}
	
	// Calculate Area
	double areaFunc(double r)
	{
		return this.area = Math.PI*r*r;
	}
	
	
}

public class Solution2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		// Take input from user
		System.out.print("Enter a Radius: ");
		double radius = sc.nextDouble();
		
		Circle circle1 = new Circle();
		// Get values
		double circumference = circle1.circumFunc(radius);
		double area = circle1.areaFunc(radius);
		
		// print
		System.out.printf("Circumference = %.2f \n", circumference);
		System.out.printf("Area = %.2f \n", area);
		
		
	}
}