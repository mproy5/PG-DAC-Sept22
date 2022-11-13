/*

Diwali Assignment: Arrays Coding Questions:

Q10. Given an array of integers, print whether the numbers are in ascending order or in
descending order or in random order without sorting
Input: [5,14,35,90,139] Output: Ascending
Input: [88,67,35,14,-12] Output: Descending
Input: [65,14,129,34,7] Output: Random

*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter elements: ");
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Input: ");
		System.out.println(Arrays.toString(arr));
		
		int flag = 0;
		
		// Algorithm
		for(int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i] > arr[i+1])
				flag += 1;
			
			if(arr[i] < arr[i+1])
				flag += 2;
				
		}
		
		if(flag == size - 1)
			System.out.println("Output: Descending");
		else if(flag == size * 2 - 2)
			System.out.println("Output: Ascending");
		else
			System.out.println("Output: Random");
	
	}
	
}

/*
OUTPUT:
Input: [5,14,35,90,139] 
Output: Ascending
Input: [88,67,35,14,-12] 
Output: Descending
Input: [65,14,129,34,7] 
Output: Random

*/