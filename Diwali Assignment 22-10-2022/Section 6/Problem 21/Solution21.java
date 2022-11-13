/*

Diwali Assignment: Collection coding questions:

Q21.  Write a Java program to remove all the elements from a priority queue.

*/

// Solution:

import java.util.*;

public class Solution21
{
	
	public static void display(PriorityQueue<String> list)
	{
		for(String x : list)
			System.out.print(x+" ");
		
		System.out.println();
	}
	
	
	
	public static void main(String[] args)
	{
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		
		
		queue1.add("5");
		queue1.add("2");
		queue1.add("8");
		queue1.add("7");
		queue1.add("9");
		queue1.add("1");
		
		System.out.println("Before: ");
		display(queue1);
		
		// remove all the elements
		queue1.clear();
		System.out.println();
		System.out.println("After: ");
		display(queue1);
		
		
		
		
	}
}

/*

OUTPUT:
Before:
1 5 2 7 9 8

After:


*/