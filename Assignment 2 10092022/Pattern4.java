// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 4

/* Output */
/*

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/

/* Program Start */
class Pattern4
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=5; i++)
		{
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


