/*

Diwali Assignment: Arrays Coding Questions:

Q4. Write a program to reverse an Array in java.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution4
{
	public static void main(String args[])
	{
		ArrayOp arrOp = new ArrayOp();
		
		int[] arr1 = {1, 2, 3, 4, 5, 6};
		int[] arr2 = {5, 4, 3, 2, 1};
		
		System.out.println(Arrays.toString(arrOp.reverseArr(arr1)));
		System.out.println(Arrays.toString(arrOp.reverseArr(arr2)));
		/*
		OUTPUT:
		[6, 5, 4, 3, 2, 1]
		[1, 2, 3, 4, 5]
		*/
	}
}

class ArrayOp
{
	public int[] reverseArr(int[] arr)
	{
		for(int i=0; i<arr.length/2; i++)
		{
			// Swap two position
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 -i];
			arr[arr.length - 1 - i] = temp;
		}
		return arr;
	}

}