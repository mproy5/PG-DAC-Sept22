/*

Diwali Assignment: Arrays Coding Questions:

Q8. Write a program which takes an array of integers and prints the running average of 3
	consecutive integers.
	In case the array has "fewer" than 3 integers, there should be no output.
	Input: [5,14,35,89,140]
	Output: [18, 46, 88]
	(Explanation: 18=(5+14+35/3, 46=(14+35+89)/3, ...)

*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution8
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
		
		int[] result = new int[arr.length - 2];
		
		for (int i = 0; i < arr.length - 2; i++)
		{
			result[i] = (arr[i] + arr[i+1] + arr[i+2])/3;
			
		}
		
		System.out.println("Output: ");
		
		if(arr.length > 2)
			System.out.println(Arrays.toString(result));
		else
			System.out.println();
		
		
		
		
	}
	
}

/*
OUTPUT:
Enter Size:
5
Enter elements:
5
14
35
89
140
Input:
[5, 14, 35, 89, 140]
Output:
[18, 46, 88]

*/