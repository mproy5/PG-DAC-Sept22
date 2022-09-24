// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 9

/* Output */
/*

    A
   A B
  A B C
 A B C D
A B C D E

*/

/* Program Start */
class Pattern9
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=5; i++)
		{
			char ch = 'A';
			
			// for Space Triangle
			for(int j=5; j>i; j--)
			{
				// double space
				System.out.print(" ");
			}
			
			// Column loop
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			// for new line
			System.out.println();
		}
	}
}


