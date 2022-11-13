/*

Diwali Assignment: Collection coding questions:

Q5. Write a Java program to reverse elements in a array list.

*/

// Solution:

import java.util.*;

public class Solution5
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
		
		// reverse
		Collections.reverse(list1);
		
		display(list1);
		
		
		
		
		
	}
}

/*

OUTPUT:
Krit
Meet
Anu
Ram

*/