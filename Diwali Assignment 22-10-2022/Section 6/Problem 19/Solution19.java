/*

Diwali Assignment: Collection coding questions:

Q19.  Write a Java program to create a new tree set, add some colors (string) and print out the
tree set.

*/

// Solution:

import java.util.*;

public class Solution19
{
	
	public static void display(TreeSet<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	
	public static void main(String[] args)
	{
		TreeSet<String> list1 = new TreeSet<>();
		
		
		list1.add("Pink");
		list1.add("Orange");
		list1.add("Blue");
		list1.add("Green");
		
		display(list1);
		
		
	}
}

/*

OUTPUT:
Blue
Green
Orange
Pink
*/