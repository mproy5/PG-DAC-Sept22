/*

Diwali Assignment: Collection coding questions:

Q9. Write a Java program to insert the specified element at the specified position in the linked
list.

*/

// Solution:

import java.util.*;

public class Solution9
{
	
	public static void display(LinkedList<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	// Method to add at a index
	public static void insert(LinkedList<String> list, int index, String str)
	{
		list.add(index, str);
	}	
	
	public static void main(String[] args)
	{
		LinkedList<String> list1 = new LinkedList<>();
		
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		// insert at index 2
		insert(list1, 2, "Mala");
		
		display(list1);
		
		
		
		
		
	}
}

/*

OUTPUT:
Ram
Anu
Mala
Meet
Krit

*/