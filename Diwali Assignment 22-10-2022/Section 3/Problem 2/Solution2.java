/*

Diwali Assignment: Arrays Coding Questions:

Q2. Write a Java program to check the equality of two arrays?


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution2
{
	static int flag = 0;
	
	static void equalArr(int[] arr1, int[] arr2)
	{
		if(arr1.length == arr2.length)
		{
			for(int i=0; i<arr1.length; i++)
			{
				if(arr1[i] != arr2[i])
				{
					flag = 0;
					break;
				}
				else
				{
					flag = 1;
				}
			}
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		if(flag == 1)
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
		
	}
	
	public static void main(String[] args)
	{
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {1, 2, 4, 6, 5};
		int[] arr3 = {1, 2, 3, 4, 5};
		
		// Check for equality
		equalArr(arr1, arr2);
		equalArr(arr1, arr3);
		equalArr(arr2, arr3);
		
		/*
		OUTPUT:
		Not Equal
		Equal
		Not Equal
		*/
	}
}

