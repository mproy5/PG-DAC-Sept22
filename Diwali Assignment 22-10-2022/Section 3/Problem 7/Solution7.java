/*

Diwali Assignment: Arrays Coding Questions:

Q7. Write a program to merge two arrays of integers by reading one number at a time from
	each array until one of the array is exhausted, and then concatenating the remaining
	numbers.
	Input: [23,60,94,3,102] and [42,16,74]
	Output: [23,42,60,16,94,74,3,102]


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution7
{
	public static void main(String[] args)
	{
		ArrayOp arrOp = new ArrayOp();
		
		int[] arr1 = {23,60,94,3,102};
		int[] arr2 = {42,16,74};
		
		System.out.println(Arrays.toString(arrOp.unionArr(arr1, arr2))); // [23, 42, 60, 16, 94, 74, 3, 102]
	}
}

class ArrayOp
{
	public int[] unionArr(int[] arr1, int[] arr2)
	{
		int[] union = new int[arr1.length + arr2.length];
		int index = 0;
		
		for(int i=0; i<((arr1.length>arr2.length) ? arr1.length : arr2.length); i++)
		{
			if(i<arr1.length)
			{
				union[index] = arr1[i];
				index++;
			}	
			
			if(i<arr2.length)
			{
				union[index] = arr2[i];
				index++;
			}
			
		}
		
		return union;
	}
}