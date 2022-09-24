// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 2 - Pattern 6

/* Output */
/*

*********
 *******
  *****
   ***
    *

*/

/* Program Start */
class Star6
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=5; i>=1; i--)
		{
			
			// Space Triangle
			for(int j=5-i; j>0; j--)
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


