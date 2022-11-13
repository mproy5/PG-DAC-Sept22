/*

Diwali Assignment: Collection coding questions:

Q3. Write a Java program to retrieve an element (at a specified index) from a given array list.


*/

// Solution:

import java.util.*;

public class Solution3
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
		
		// retrieve an element at index 2
		System.out.println(list1.get(2)); // Meet
		
		
		
		
		
	}
}

/*

OUTPUT:
Meet

*/