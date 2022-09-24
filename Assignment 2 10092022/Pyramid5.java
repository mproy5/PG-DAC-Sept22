// Pattern Assignment 10/09/2022
// Author: Mahendra Pratap Roy
// Part 3 - Pyramid Pattern 5

/* Output */
/*

                9
              8 9 8
            7 8 9 7 8
          6 7 8 9 6 7 8
        5 6 7 8 9 5 6 7 8
      4 5 6 7 8 9 4 5 6 7 8
    3 4 5 6 7 8 9 3 4 5 6 7 8
  2 3 4 5 6 7 8 9 2 3 4 5 6 7 8
1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8

*/

/* Program Start */
class Pyramid5
{
	public static void main(String args[])
	{
		
		// Row loop
		for(int i=0; i<9; i++)
		{
			// for Space Triangle
			for(int j=8; j>i; j--)
			{
				System.out.print("  ");
			}
			
			// Triangle 1
			for(int j=9-i; j<=9; j++)
			{
				System.out.print(j+" ");
			}
			
			// Triangle 2
			for(int j=9-i; j<9; j++)
			{
				System.out.print(j+" ");
			}
			
			// for new line
			System.out.println();
		}
	}
}


