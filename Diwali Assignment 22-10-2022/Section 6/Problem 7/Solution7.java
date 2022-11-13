/*

Diwali Assignment: Collection coding questions:

Q7. Write a Java program to print all the elements of a ArrayList using the position of the
elements.

*/

// Solution:

import java.util.*;

public class Solution7
{
	// print method
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
		
		// print
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