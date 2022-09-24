// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 8

/* Output */
/*

    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

*/

/* Program Start */
class Pattern8
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=0; i<5; i++)
		{
			
			
			// for Space Triangle
			for(int j=4; j>i; j--)
			{
				// double space
				System.out.print(" ");
			}
			
			// Column loop
			for(int j=5-i; j<=5; j++)
			{
				System.out.print(j+" ");
				
			}
			// for new line
			System.out.println();
		}
	}
}


