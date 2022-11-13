/*

Diwali Assignment: Collection coding questions:

Q10. Write a Java program to insert elements into the linked list at the first and last position.

*/

// Solution:

import java.util.*;

public class Solution10
{
	
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
		
		// Insert First
		list1.add(0, "Mala");
		
		
		
		display(list1);
		
		
		
		
		
	}
}

/*

OUTPUT:
Mala
Ram
Anu
Meet
Krit

*/