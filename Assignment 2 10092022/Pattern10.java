// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 1 - Pattern 10

/* Output */
/*

     E
    D E
   C D E
  B C D E
 A B C D E

*/

/* Program Start */
class Pattern10
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=0; i<5; i++)
		{
			char ch = 'E';
			ch = (char)(ch - i);
			// for Space Triangle
			for(int j=5; j>i; j--)
			{
				
				System.out.print(" ");
			}
			
			// Column loop
			for(int j=5-i; j<=5; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			// for new line
			System.out.println();
		}
	}
}


