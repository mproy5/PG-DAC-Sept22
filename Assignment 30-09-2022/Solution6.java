/*
* 06.	Write a program to convert temperature from Fahrenheit to Celsius. 
* Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]
*/

// Author  : Mahendra Pratap Roy
// PRN No. : 220940320060



// Import 
import java.util.*;


	
public class Solution6
{
	// Converter function
	static double celciousConvereter(double farenht)
	{
			
		return 5 * (farenht - 32) / 9;
	
	}
		
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Farenheit Value: ");
		double farenht = sc.nextDouble();
		
		// Get Value
		double celc = celciousConvereter(farenht);
		
		System.out.printf("Celciuos : %.2f\n", celc);
		
	
	}
}