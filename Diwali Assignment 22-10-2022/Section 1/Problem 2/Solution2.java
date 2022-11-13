/*

Diwali Assignment: Logical Coding Question:

Q2.
*********
 *     *
  *   *
   * *
    *

*/

// Solution:

public class Solution2
{
	public static void main(String args[])
	{
		
		int input = 4;
		
		int flag = 2*input + 1;
		
		
		for(int i = 0; i < flag; i++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		
		for(int i = 0; i < input; i++ )
		{
			flag = flag - 2;
			
			for(int j = 0; j <= i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = flag; j > 0; j--)
			{
				if(j == 1 || j == flag)
				{
					System.out.print("*");
					System.out.print(" ");
				}
				
				if (j > 1 && j < flag - 1)
					System.out.print(" ");
				
			}
			
			
			
			System.out.println();
			
		}
		
	}
}

/*

OUTPUT:

*********
 *     *
  *   *
   * *
    *

*/