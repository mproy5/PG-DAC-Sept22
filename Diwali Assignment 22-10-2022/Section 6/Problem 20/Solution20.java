/*

Diwali Assignment: Collection coding questions:

Q20.  Write a Java program to find the numbers less than 7 in a tree set.

*/

// Solution:

import java.util.*;

public class Solution20
{
	
	public static void display(TreeSet<String> list)
	{
		for(String x : list)
			System.out.print(x+" ");
		
		System.out.println();
	}
	
	// Method to find the numbers less than 7
	public static TreeSet<String> compare(TreeSet<String> list)
	{
		TreeSet<String> newList = new TreeSet<>();
		
		for(String x : list)
		{
			if(Integer.parseInt(x) < 7)
				newList.add(x);
		}
		
		return newList;
		
	}
	
	public static void main(String[] args)
	{
		TreeSet<String> list1 = new TreeSet<>();
		
		
		list1.add("5");
		list1.add("2");
		list1.add("8");
		list1.add("7");
		list1.add("9");
		list1.add("1");
		
		
		display(list1);
		
		TreeSet<String> newList = compare(list1);
		display(newList);
		
		
	}
}

/*

OUTPUT:
1 2 5 7 8 9
1 2 5
*/