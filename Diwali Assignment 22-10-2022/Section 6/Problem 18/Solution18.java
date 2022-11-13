/*

Diwali Assignment: Collection coding questions:

Q18.  Write a Java program to compare two sets and retain elements which are same on both
sets.

*/

// Solution:

import java.util.*;

public class Solution18
{
	
	public static void display(HashSet<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	// compare
	public static void compareDel(HashSet<String> list1, HashSet<String> list2)
	{
		
		list1.retainAll(list2);
	}
	
	public static void main(String[] args)
	{
		HashSet<String> list1 = new HashSet<>();
		
		
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		HashSet<String> list2 = new HashSet<>();
	
		list2.add("Ram");
		list2.add("Mala");
		list2.add("Meet");
		list2.add("Amol");

		// compare
		compareDel(list1, list2);
		display(list1);
		
		
		
		
	
		
	}
}

/*

OUTPUT:
Meet
Ram

*/