// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 3 - Pyramid Pattern 7

/* Output */
/*

9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1

*/

/* Program Start */
class Pyramid7
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=9; i>=1; i--)
		{
			// for Space Triangle
			for(int j=9-i; j>0; j--)
			{
				System.out.print(" ");
			}
			
			// Column loop
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
			
			
			// for new line
			System.out.println();
		}
	}
}


