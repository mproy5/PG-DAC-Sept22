/*

Diwali Assignment: Collection coding questions:

Q11. Write a Java program to display the elements and their positions in a linked list.

*/

// Solution:

import java.util.*;

public class Solution11
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
		
		
		
		
		
	}
}

/*

OUTPUT:
Ram
Anu
Meet
Krit

*/