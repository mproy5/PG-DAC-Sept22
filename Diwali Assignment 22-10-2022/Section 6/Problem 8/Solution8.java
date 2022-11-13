/*

Diwali Assignment: Collection coding questions:

Q8. Write a Java program to append the specified element to the end of a linked list.

*/

// Solution:

import java.util.*;

public class Solution8
{
	
	public static void display(LinkedList<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	// Method to add to the end
	public static void insertEnd(LinkedList<String> list, String str)
	{
		int size = list.size();
		list.add(size, str);
	}	
	
	public static void main(String[] args)
	{
		LinkedList<String> list1 = new LinkedList<>();
		
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		// insert at end of list
		insertEnd(list1, "Mala");
		
		display(list1);
		
		
		
		
		
	}
}

/*

OUTPUT:
Ram
Anu
Meet
Krit
Mala

*/