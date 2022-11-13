/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q14.  Java Program to Create a Method with 2 Parameters and without Return Type.



*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution14
{
	public static void main(String args[])
	{
		MathOperation mo = new MathOperation();
		
		// Method call
		mo.multiplication(5.0, 3.0);   // Multiplication: 15.0
	}
}


class MathOperation
{
	// Method with 2 Parameters and without Return Type
	public void multiplication(double x, double y)
	{
		System.out.println("Multiplication: " + (x * y));
	}
}