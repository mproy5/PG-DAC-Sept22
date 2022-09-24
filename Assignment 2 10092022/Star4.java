// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 2 - Pattern 4

/* Output */
/*

*****
 ****
  ***
   **
    *

*/

/* Program Start */
class Star4
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=5; i>=1; i--)
		{
			
			// Space Triangle
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
				
			}

			// Column loop
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				
				
			}
			
			
			
			// for new line
			System.out.println();
			
		}
	}
}


