// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 3 - Pyramid Pattern 2

/* Output */
/*

        1
       1 2
      1 2 3
     1 2 3 4
    1 2 3 4 5
   1 2 3 4 5 6
  1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9

*/

/* Program Start */
class Pyramid2
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
				System.out.print(j+" ");
			}
			// for new line
			System.out.println();
		}
	}
}


