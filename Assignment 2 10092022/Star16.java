// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 2 - Pattern 16

/* Output */
/*

    *
   **
  * *
 *  *
*****

*/

/* Program Start */
class Star16
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=5; i++)
		{
			
			// Space Triangle
			for(int j=5; j>i; j--)
			{
				System.out.print(" ");
				
				
			}

			// Column loop
			for(int j=1; j<=i; j++)
			{
				if((i==3&&j==2)||(i==4&&j==2)||(i==4&&j==3))
					System.out.print(" ");
				else
					System.out.print("*");
				
				
			}
			
			
			
			// for new line
			System.out.println();
			
		}
	}
}


