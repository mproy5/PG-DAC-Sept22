/*

Diwali Assignment: Collection coding questions:

Q1. Write a Java program to create a new array list, add some colors (string) and print out the
collection.


*/

// Solution:

import java.util.*;

public class Solution1
{
	public static void display(ArrayList<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Pink");
		list1.add("Blue");
		list1.add("Yellow");
		list1.add("Green");
		list1.add("Orange");
		
		display(list1);
		
		
	}
}

/*

OUTPUT:
Pink
Blue
Yellow
Green
Orange

*/