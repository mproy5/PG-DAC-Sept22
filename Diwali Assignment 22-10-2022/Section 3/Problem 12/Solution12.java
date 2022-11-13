/*

Diwali Assignment: Arrays Coding Questions:

Q12. How to rotate an array left and right by a given number K?

*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution12
{
	static public void display(int[] arr)
	{
		for(int x : arr)
			System.out.print(x + ", ");
		
		System.out.println();
	}
	
	public static void main(String args[])
	{
		int[] arr = {1, 2, 3, 4, 5};
		
		// take input
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter K = ");
		int k = sc.nextInt();
		
		System.out.println("Input: ");
		display(arr);
		
		int[] arr1 = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++)
		{
			if(k == arr.length)
				k = 0;
			
			arr1[i] = arr[k];
			k++;
		}
		

		System.out.println("Output: " + Arrays.toString(arr1));  
	
	}
	
}

/*
OUTPUT:
Enter K = 2
Input:
1, 2, 3, 4, 5,
Output: [3, 4, 5, 1, 2]
*/