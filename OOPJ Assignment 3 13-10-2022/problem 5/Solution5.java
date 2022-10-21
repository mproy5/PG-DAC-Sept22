/* 

MODULE 2 OOPJ : ASSIGNMENT 3

Q5. Implement the classes for the following inheritance hierarchies. Create an interface Shape that contains 
methods area, draw, rotate, move etc. Now create two classes Circle and Rectangle that 
implement this Shape interface and implement the methods area, move, etc. Write a main() function 
to create two Circle and three Rectangle,then move them. Print the details of circles and rectangles 
before after moving them.  
 



Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/

import java.lang.*;
import java.util.*;

// MAIN CLASS
public class Solution5
{
	public static void main(String[] args)
	{
		// Create two Circles
		Circle circle1 = new Circle("Circle 1", 5.0, 2, 5);
		Circle circle2 = new Circle("Circle 2", 2.0, 4, 7);
		
		// Create three Rectangles
		Rectangle rect1 = new Rectangle("Rectangle 1", 2.0, 4.0, 3, 5);
		Rectangle rect2 = new Rectangle("Rectangle 2", 3.0, 5.0, 8, 10);
		Rectangle rect3 = new Rectangle("Rectangle 3", 7.0, 9.0, -3, -5);
		
		// Print before move
		System.out.println("BEFORE MOVE ->");
		circle1.printCircle();
		circle2.printCircle();
		rect1.printRect();
		rect2.printRect();
		rect3.printRect();
		
		// move() operation
		circle1.move(2, 4);
		circle2.move(1, 2);
		rect1.move(4, 1);
		rect2.move(-5, -7);
		rect3.move(5, 9);
		
		
		
		// After Move
		System.out.println("--------------------------------------------");
		// for spacing
		System.out.println();
		System.out.println("AFTER MOVE ->");
		circle1.printCircle();
		circle2.printCircle();
		rect1.printRect();
		rect2.printRect();
		rect3.printRect();
		
		
		
		
	}
}

// SHAPE CLASS
interface Shape 
{
	// To calculate area of a shape
	double calArea();
	
	// To draw a shape
	void draw();
	
	// To rotate a shape
	void rotate();
	
	// To move a shape
	void move(int x, int y);
	
}


// CIRCLE CLASS
class Circle implements Shape
{	
	// Data Members
	double radius;
	int xAxisValue;
	int yAxisValue;
	String name;
	
	// Constructors
	Circle()
	{
		
	}
	
	Circle(String name, double radius, int xAxisValue, int yAxisValue)
	{
		this.radius = radius;
		this.xAxisValue = xAxisValue;
		this.yAxisValue = yAxisValue;
		this.name = name;
		
	}
	
	// Implenting Methods	
	public double calArea()
	{
		return 3.14 * radius * radius;
	}
	
	public void move(int x, int y)
	{
		// Only move right side on coordinate
		xAxisValue += x;
		yAxisValue += y;
	}
	
	public void draw()
	{
		// Code
	}
	
	public void rotate()
	{
		// Code
	}
	
	// Methods
	public void printCircle()
	{
		System.out.println("Area of "+ name +" = " + calArea());
		System.out.println("Coordinate : (" + xAxisValue + ", " + yAxisValue + ")");
		System.out.println();
		
	}
	
}


// RECTANGLE CLASS
class Rectangle implements Shape
{
	// Data Members
	double length;
	double width;
	int xAxisValue;
	int yAxisValue;
	String name;
	
	// Constructors
	Rectangle()
	{
		
	}
	
	Rectangle(String name, double length, double width, int xAxisValue, int yAxisValue)
	{
		this.length = length;
		this.width = width;
		this.xAxisValue = xAxisValue;
		this.yAxisValue = yAxisValue;
		this.name = name;
		
		
	}
	
	// Implementing Methods
	public double calArea()
	{
		return length * width;
	}
	
	public void move(int x, int y)
	{
		// Only move right side on coordinate
		xAxisValue += x;
		yAxisValue += y;
	}
	
	public void draw()
	{
		// Code
	}
	
	public void rotate()
	{
		// Code
	}
	
	// Methods
	public void printRect()
	{
		System.out.println("Area of " + name + " = " + calArea());
		System.out.println("Coordinate : (" + xAxisValue + ", " + yAxisValue + ")");
		System.out.println();
		
	}
	
}

/*
OUTPUT:

BEFORE MOVE ->
Area of Circle 1 = 78.5
Coordinate : (2, 5)

Area of Circle 2 = 12.56
Coordinate : (4, 7)

Area of Rectangle 1 = 8.0
Coordinate : (3, 5)

Area of Rectangle 2 = 15.0
Coordinate : (8, 10)

Area of Rectangle 3 = 63.0
Coordinate : (-3, -5)

--------------------------------------------

AFTER MOVE ->
Area of Circle 1 = 78.5
Coordinate : (4, 9)

Area of Circle 2 = 12.56
Coordinate : (5, 9)

Area of Rectangle 1 = 8.0
Coordinate : (7, 6)

Area of Rectangle 2 = 15.0
Coordinate : (3, 3)

Area of Rectangle 3 = 63.0
Coordinate : (2, 4)

*/