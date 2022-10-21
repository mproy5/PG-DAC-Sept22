/* 

MODULE 2 OOPJ : ASSIGNMENT 2 

Q7. Create a class MathOperation that has four static methods. add() method that takes two integer numbers as 
parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and 
returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the 
product. power() method that takes two integer numbers as parameter and returns the power of first number to 
second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four 
methods of MathOperation class by providing entered numbers and prints the return values of every method.  

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/


import java.lang.*;
import java.util.*;

public class MathDemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Input from user
		System.out.print("Enter First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int num2 = sc.nextInt();
		
		// print addition
		int add = MathOperation.add(num1, num2);
		System.out.println("Addition: " + add);
		
		// print subtraction
		int subtract = MathOperation.subtract(num1, num2);
		System.out.println("Subtraction: " + subtract);
		
		// print multiplication
		int multiply = MathOperation.multiply(num1, num2);
		System.out.println("Multiplication: " + multiply);
		
		// print multiplication
		double power = MathOperation.power(num1, num2);
		System.out.println("Power: " + power);
		
		
	}
}

class MathOperation
{
	// Static Methods
	
	// add two integer
	static int add(int num1, int num2)
	{
		return num1 + num2;
	}
	
	// subtract teo integer
	static int subtract(int num1, int num2)
	{
		return num1 - num2;
	}
	
	// Multiply two integer
	static int multiply(int num1, int num2)
	{
		return num1 * num2;
	}
	
	// power of first integer to second integer
	static double power(int num1, int num2)
	{
		double result = 1;
		
		// power zero of any number is 1
		if (num2 == 0)
			return 1;
		
		// for negative power
		if (num2 < 0) 
		{
			// for negative power
			for (int i = 0; i > num2; i--)
				result *= num1;
			
			
			return 1 / result;
		}
		
		// for positive power
		for (int i = 0; i < num2; i++)
			result *= num1;
		
		return result;
		
	}
}
