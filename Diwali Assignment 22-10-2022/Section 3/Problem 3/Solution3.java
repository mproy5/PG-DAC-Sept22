/*

Diwali Assignment: Arrays Coding Questions:

Q3. Write a Java program to find all pairs of elements in an integer array whose sum is equal
to a given number?


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution3
{
	public static void main(String args[])
	{
		ArrayOp arrOp = new ArrayOp();
		
		int[] arr = {2, 6, 8, 4, 1, 9};
		
		// Print result
		arrOp.sumEq(arr, 10);
		/*
		Output:
		[2, 8]
		[6, 4]
		[1, 9]
		*/
	}
	
}

class ArrayOp
{
	public void sumEq(int[] arr, int num)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i; j<arr.length; j++)
			{
				// Check for sum
				if(arr[i] + arr[j] == num)
				{
					System.out.println("[" + arr[i] + ", " + arr[j] + "]");
				}
			}
		}
	}
}