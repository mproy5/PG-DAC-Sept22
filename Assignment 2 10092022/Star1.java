// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 2 - Pattern 1

/* Output */
/*

*
**
***
****
*****

*/

/* Program Start */
class Star1
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=5; i++)
		{


			// Column loop
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
				
				
			}
			
			
			
			// for new line
			System.out.println();
			
		}
	}
}


