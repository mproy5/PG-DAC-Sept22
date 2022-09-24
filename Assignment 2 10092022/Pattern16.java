// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 16

/* Output */
/*

5
5 4
5 4 3
5 4 3 2
5 4 3 2 1

*/

/* Program Start */
class Pattern16
{
	public static void main(String args[])
	{

		// Row loop
		for(int i=5; i>=1; i--)
		{
			
			
			
			// Column loop
			for(int j=5; j>=i; j--)
			{
				System.out.print(j+" ");
				
			}
			
			
			
			// for new line
			System.out.println();
			
		}
	}
}


