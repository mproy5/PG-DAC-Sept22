/*

Diwali Assignment: Arrays Coding Questions:

Q9. Write a program which generates the series 1,4,27,16,125,36

*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution9
{
	public static void main(String args[])
	{
		
		for(int i = 1; i < 7; i++)
		{
			if(i % 2 == 0)
				System.out.print((int)Math.pow(i, 2) + " ");
			else
				System.out.print((int)Math.pow(i, 3) + " ");
		}
		
	
	}
	
}

/*
OUTPUT:
1 4 27 16 125 36

*/