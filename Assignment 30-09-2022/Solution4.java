/*
* Q4.Write a program to find the simple interest. 
* Take the principle amount, rate of interest and time from user using Scanner class. 
*/

// Author  : Mahendra Pratap Roy
// PRN No. : 220940320060


// Import 
import java.util.*;

	
public class Solution4
{
	static double calcInterest(int principalAmt, int year, float rate)
	{
		return principalAmt * year * rate / 100;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		// Take Input
		System.out.print("Enter Principal Amount: ");
		int principalAmt = sc.nextInt();
		System.out.print("Enter Time in Years: ");
		int year = sc.nextInt();
		System.out.print("Enter Rate of Interest in Percentage: ");
		float rate = sc.nextFloat();
		
		
		// Get value
		double interest = calcInterest(principalAmt, year, rate);
		
		// Print
		System.out.println("-----------------------------------------");
		System.out.printf("Interest: %.1f \n", interest);
		
	
	}
}