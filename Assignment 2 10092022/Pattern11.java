// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 11

/* Output */
/*

    *
   ***
  *****
 *******
*********

*/

/* Program Start */
class Pattern11
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=5; i++)
		{
			
			// Space triangle
			
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
				
			}
			
			// Triangle 1
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				
			}
			
			// Triangle 2
			for(int j=1; j<i; j++)
			{
				System.out.print("*");
				
			}
			
			// for new line
			System.out.println();
		}
	}
}


