/*

Diwali Assignment: Collection coding questions:

Q4. Write a Java program to sort a given array list.


*/

// Solution:

import java.util.*;

public class Solution4
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
		
		// Sorted Ascending order
		Collections.sort(list1);
		
		display(list1);
		
		
		
		
		
	}
}

/*

OUTPUT:
Anu
Krit
Meet
Ram

*/