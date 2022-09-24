// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 15

/* Output */
/*

5 4 3 2 1
5 4 3 2
5 4 3
5 4
5

*/

/* Program Start */
class Pattern15
{
	public static void main(String args[])
	{

		// Row loop
		for(int i=5; i>=1; i--)
		{
			
			
			
			// Column loop
			for(int j=5; j>5-i; j--)
			{
				System.out.print(j+" ");
				
			}
			
			
			
			// for new line
			System.out.println();
			
		}
	}
}


