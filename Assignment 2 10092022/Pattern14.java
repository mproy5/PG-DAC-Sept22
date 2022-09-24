// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 14

/* Output */
/*

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

/* Program Start */
class Pattern14
{
	public static void main(String args[])
	{

		// Row loop
		for(int i=5; i>=1; i--)
		{
			
			
			
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


