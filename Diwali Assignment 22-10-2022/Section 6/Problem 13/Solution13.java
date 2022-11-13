/*

Diwali Assignment: Collection coding questions:

Q13. Write a Java program to compare two linked lists.

*/

// Solution:

import java.util.*;

public class Solution13
{
	// display method
	public static void display(LinkedList<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	// Method to compare
	public static boolean compareList(LinkedList<String> list1, LinkedList<String> list2)
	{
		for(String x : list1)
		{
			if(!list2.contains(x))
				return false;
			
			
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		LinkedList<String> list1 = new LinkedList<>();
		
		
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		LinkedList<String> list2 = new LinkedList<>();
		
		list2.add("Ram");
		list2.add("Mala");
		list2.add("Amol");
		list2.add("Krit");
		
		LinkedList<String> list3 = new LinkedList<>();
		list3.add("Ram");
		list3.add("Anu");
		list3.add("Meet");
		list3.add("Krit");
		
		// call compareList method
		System.out.println("list1 and list2: " + compareList(list1, list2));
		System.out.println("list1 and list2: " + compareList(list1, list3));
		
		
	}
}

/*

OUTPUT:
list1 and list2: false
list1 and list2: true

*/