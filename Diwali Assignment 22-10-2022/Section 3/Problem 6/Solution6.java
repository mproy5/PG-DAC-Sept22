/*

Diwali Assignment: Arrays Coding Questions:

Q6. Print the third-largest number in an array without sorting it
	Input: [ 24,54,31,16,82,45,67]
	Output: 54 (82 and 67 are the largest and second-largest)
	

*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution6
{
	public static void main(String[] args)
	{
		ArrayOp arrOp = new ArrayOp();
		
		int[] arr = {24,54,31,16,82,45,67};
		
		System.out.println("Third Largest: " + arrOp.findThirdLargest(arr));  // Third Largest: 54
	}
}

class ArrayOp
{
	public int findThirdLargest(int[] arr)
	{
		int large = arr[0];
		int index = 0;
		
		for(int j=0; j<3; j++)
		{
			arr[index] = 0;
			large = arr[0];
			for(int i=1; i<arr.length; i++)
			{
				if(arr[i] > large)
				{
					large = arr[i];
					index = i;
				}
			}
			
		}
		
		return large;
		
	}
}