/*

Diwali Assignment: Logical Coding Question:

Q1.
   
	*
   * *
  *   *
 *     *
*********

*/

// Solution:

public class Solution1
{
	public static void main(String args[])
	{
		
		int input = 4;
		
		int flag = 1;
		
		for(int i = 0; i < input; i++ )
		{
			
			for(int j = input; j > i; j--)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j < flag; j++)
			{
				if(j == 0 || j == flag - 1)
				{
					System.out.print("*");
					System.out.print(" ");
				}
				
				if (j > 1 && j < flag - 1)
					System.out.print(" ");
				
			}
			
			flag = flag + 2;
			
			System.out.println();
			
		}
		
		for(int i = 0; i < flag; i++)
		{
			System.out.print("*");
		}
	}
}

/*

OUTPUT:

	*
   * *
  *   *
 *     *
*********

*/