/*
* 05.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
* Now convert the entered days into complete years, months and days and print them.
*/

// Author  : Mahendra Pratap Roy
// PRN No. : 220940320060


// Import 
import java.util.*;
	
public class Solution5
{
	// Converter function
	static void dateConvereter(int days)
	{
			
		int year = days/365;
		int temp = days%365;
		int month = temp/30;
		days = temp%30;
			
		System.out.println(year + " Year, " + month+ " month, " + days + " days.");
	
	}
		
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of Days: ");
		int days = sc.nextInt();
		
		// Function call
		dateConvereter(days);
	
	}
}