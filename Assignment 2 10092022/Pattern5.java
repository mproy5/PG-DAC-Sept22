// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 5


/* Output */
/*

A
B B
C C C
D D D D
E E E E E
*/

/* Program Start */
class Pattern5
{
	public static void main(String args[])
	{
		char ch = 'A';
		
		// Row loop
		for(int i=1; i<=5; i++)
		{
			// Column loop
			for(int j=1; j<=i; j++)
			{
				System.out.print(ch + " ");
				// increase ASCII value
			}
			// for new line
			System.out.println();
			ch++;
		}
	}
}


