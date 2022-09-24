// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 17

/* Output */
/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

/* Program Start */
class Pattern17
{
	public static void main(String args[])
	{
		int counter = 1;
		// Row loop
		for(int i=1; i<=5; i++)
		{

			
			// Column loop
			for(int j=1; j<=i; j++)
			{
				System.out.print(counter+" ");
				counter++;
				
			}
			
			
			
			// for new line
			System.out.println();
			
		}
	}
}


