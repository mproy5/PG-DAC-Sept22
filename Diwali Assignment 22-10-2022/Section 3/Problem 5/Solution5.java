/*

Diwali Assignment: Arrays Coding Questions:

Q5. Find out smallest and largest number in a given Array?


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution5
{
	public static void main(String args[])
	{
		ArrayOp arrOp = new ArrayOp();
		
		int[] arr = {3, 5, 9, 1, 7};
		
		System.out.println("Smallest: " + arrOp.findSmallest(arr));
		System.out.println("Largest: " + arrOp.findLargest(arr));
		/*
		OUTPUT:
		Smallest: 1
		Largest: 9
		*/
	}
}

class ArrayOp
{
	public int findSmallest(int[] arr)
	{
		int small = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] < small)
			{
				small = arr[i];
			}
		}
		
		return small;
	}
	
	public int findLargest(int[] arr)
	{
		int large = arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] > large)
			{
				large = arr[i];
			}
		}
		
		return large;
	}
}