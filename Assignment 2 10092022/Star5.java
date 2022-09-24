// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 2 - Pattern 5

/* Output */
/*
    *
   ***
  *****
 *******
*********

*/

/* Program Start */
class Star5
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=5; i++)
		{
			
			// Space Triangle
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


