// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 2


/* Output */
/*

A
A B
A B C
A B C D
A B C D E

*/

/* Program Start */
class Pattern2
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=1; i<=5; i++)
		{
			char ch = 'A';
			// Column loop
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch + " ");
				// increase ASCII value
				ch++;
			}
			// for new line
			System.out.println();
		}
	}
}


