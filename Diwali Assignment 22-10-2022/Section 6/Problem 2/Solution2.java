/*

Diwali Assignment: Collection coding questions:

Q2. Write a Java program to insert an element into the array list at the first position.


*/

// Solution:

import java.util.*;

public class Solution2
{
	public static void display(ArrayList<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	public static void insertFirst(ArrayList<String> list, String str)
	{
		list.add(0, str);
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<>();
		
		insertFirst(list1, "Pink");
		insertFirst(list1, "Red");
		insertFirst(list1, "Yellow");
		insertFirst(list1, "Orange");
		
		display(list1);
		
		
	}
}

/*

OUTPUT:
Orange
Yellow
Red
Pink

*/