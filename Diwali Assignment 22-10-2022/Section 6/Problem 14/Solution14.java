/*

Diwali Assignment: Collection coding questions:

Q14. Write a Java program to replace an element in a linked list.

*/

// Solution:

import java.util.*;

public class Solution14
{
	// display method
	public static void display(LinkedList<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	
	
	public static void main(String[] args)
	{
		LinkedList<String> list1 = new LinkedList<>();
		
		
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		System.out.println("Before:");
		display(list1);
		
		// replace index 2
		list1.set(2, "Mala");
		
		System.out.println();
		System.out.println("After:");
		display(list1);
		
	}
}

/*

OUTPUT:
Before:
Ram
Anu
Meet
Krit

After:
Ram
Anu
Mala
Krit

*/