/* 

MODULE 2 OOPJ : ASSIGNMENT 2 

Q3. Write a class to represent complex numbers with necessary constructors. Write member functions to add, multiply 
two complex numbers. There should be three constructors: (i) to initialize real and imaginary parts to 0; (ii) to 
initialize imaginary part to 0 but to initialize the real part to user defined value; (iii) to initialize the real part and the 
imaginary part to user defined values. Also, write a main() function to (i) create two complex numbers 3+2i and 4-
2i; (ii) to print the sum and product of those numbers. 

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/

import java.lang.*;
import java.util.*;


public class Solution3
{
	public static void main(String[] args)
	{
		ComplexNumber cn1 = new ComplexNumber(3, 2);  // 3+2i
		ComplexNumber cn2 = new ComplexNumber(4, -2); // 4 - 2i
		
		
		
		// Sum block
		{
			String sum = "";
			
			// Calculate sum
			int realSum = cn1.real + cn2.real;
			int imgSum = cn1.img + cn2.img;
			
			// Condition for + or - sign
			if(imgSum >= 0)
				sum = realSum +"+"+ imgSum + "i";
			else
				sum = realSum +""+ imgSum + "i";
			
			// Print sum
			System.out.println("Sum: " + sum);  // Sum: 7+0i
		}
		
		// Product block
		{
			String product = "";
			
			int realPart = (cn1.real * cn2.real) - (cn1.img * cn2.img);
			int imgPart = (cn1.real * cn2.img) + (cn1.img * cn2.real);
			
			// Condition for + or - sign
			if(imgPart >= 0)
				product = realPart +"+"+ imgPart + "i";
			else
				product = realPart +""+ imgPart + "i";
			
			// Print product
			System.out.println("Product: " + product);  // Product: 16+2i
			
		}
	}
}

class ComplexNumber
{	
	// data members
	int real;
	int img;
	
	// Constructors
	ComplexNumber()
	{
		
	}
	
	// set only real part
	ComplexNumber(int real)
	{
		this.real = real;
		this.img = 0;
	}
	
	ComplexNumber(int real, int img)
	{
		this.real = real;
		this.img = img;
		
	}
	
	
}