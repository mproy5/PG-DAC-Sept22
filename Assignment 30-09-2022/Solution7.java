/*
* 06.	Write a program to convert temperature from Fahrenheit to Celsius. 
* Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/

// Author  : Mahendra Pratap Roy
// PRN No. : 220940320060


// Import 
import java.util.*;


	
public class Solution7
{

		
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		// Take input
		System.out.print("Type First Number : ");
		int num1 = sc.nextInt();
		System.out.print("Type Second Number : ");
		int num2 = sc.nextInt();
		
		// Swapping process
		num1 = num1 - num2;  	  // 4 - 8 = -4
		num2 = num1 + num2; 	  // -4 + 8 = 4
		num1 = num2 - num1; 	  // 4 - (-4) = 8
		
		// Print
		System.out.println("-------------------------------");
		System.out.println("First Number : " + num1);
		System.out.println("Second Number : " + num2);
	
	}
}