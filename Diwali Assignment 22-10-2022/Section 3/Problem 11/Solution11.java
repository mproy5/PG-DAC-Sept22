/*

Diwali Assignment: Arrays Coding Questions:

Q11. How to convert a byte array to String?

*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution11
{
	public static void main(String args[])
	{
		byte[] arr = {1, 2, 3, 4, 5};
		
		// byte array to string
		String str = Arrays.toString(arr);
		
		// print
		System.out.println(str);  // [1, 2, 3, 4, 5]
	
	}
	
}

/*
OUTPUT:
[1, 2, 3, 4, 5]
*/