// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 3 - Pyramid Pattern 1

/* Output */
/*

        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9

*/

/* Program Start */
class Pyramid1
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=9; i++)
		{
			// for Space Triangle
			for(int j=9; j>i; j--)
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


