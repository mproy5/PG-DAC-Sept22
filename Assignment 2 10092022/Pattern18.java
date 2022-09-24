// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 18

/* Output */
/*

A B C D E
A B C D
A B C
A B
A

*/

/* Program Start */
class Pattern18
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=5; i>=1; i--)
		{

			char ch = 'A';
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


