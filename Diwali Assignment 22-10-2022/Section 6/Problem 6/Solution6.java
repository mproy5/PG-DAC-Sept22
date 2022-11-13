/*

Diwali Assignment: Collection coding questions:

Q6. Write a Java program of swap two elements in an array list.

*/

// Solution:

import java.util.*;

public class Solution6
{
	public static void display(ArrayList<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}

	
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		// Swap index 0 and index 3
		Collections.swap(list1, 0, 3);
		
		display(list1);
		
		
		
		
		
	}
}

/*

OUTPUT:
Krit
Anu
Meet
Ram

*/