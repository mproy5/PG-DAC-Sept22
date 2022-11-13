/*

Diwali Assignment: Collection coding questions:

Q15. Write a Java program to iterate through all elements in a hash list.

*/

// Solution:

import java.util.*;

public class Solution15
{
	// iterate through all elements
	public static void display(HashSet<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	
	
	public static void main(String[] args)
	{
		HashSet<String> list1 = new HashSet<>();
		
		
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		// iterate through all elements and print
		display(list1);
	
		
	}
}

/*

OUTPUT:
Krit
Meet
Anu
Ram

*/