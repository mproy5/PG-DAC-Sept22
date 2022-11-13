/*

Diwali Assignment: Collection coding questions:

Q12. Write a Java program to check if a particular element exists in a linked list.

*/

// Solution:

import java.util.*;

public class Solution12
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
		
		// Insert last
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		// display
		display(list1);
		
		// Check if element exists
		System.out.println("Anu: " + list1.contains("Anu"));
		System.out.println("Mala: " + list1.contains("Mala"));
		
		
		
		
	}
}

/*

OUTPUT:
Ram
Anu
Meet
Krit
Anu: true
Mala: false

*/