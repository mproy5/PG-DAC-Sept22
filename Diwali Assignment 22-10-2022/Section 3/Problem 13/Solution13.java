/*

Diwali Assignment: Arrays Coding Questions:

Q13. Write a program to sort an Array in Java ?

*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution13
{
	static public void display(int[] arr)
	{
		for(int x : arr)
			System.out.print(x + ", ");
		
		System.out.println();
	}
	
	static public void swap(int[] arr, int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	
	public static void main(String args[])
	{
		int[] arr = {9, 3, 5, 8, 6};
		
		System.out.println("Input: ");
		display(arr);
		
		for(int i = 0; i<arr.length - 1; i++)
		{
			for(int j = 0; j<arr.length - i - 1; j++)
			{
				if (arr[j] > arr[j + 1])
					swap(arr, j, j+1);
			}
		}
		
		

		System.out.println("Output: " + Arrays.toString(arr));  
	
	}
	
}

/*
OUTPUT:
Input:
9, 3, 5, 8, 6,
Output: [3, 5, 6, 8, 9]
*/