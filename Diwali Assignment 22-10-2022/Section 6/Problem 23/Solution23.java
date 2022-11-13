/*

Diwali Assignment: Collection coding questions:

Q23.  Write a Java program to convert a priority queue to an array containing all of the
elements of the queue.

*/

// Solution:

import java.util.*;

public class Solution23
{	
	public static void display(PriorityQueue<String> queue)
	{
		for(String x : queue)
			System.out.println(x);
	}
	
	// Priority Queue to array
	public static String[] queueToArr(PriorityQueue<String> queue)
	{
		String[] strArr = new String[queue.size()];
		int i = 0;
		
		for(String x : queue)
		{
			strArr[i] = x;
			i++;
		}
		return strArr;
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
		
		
		System.out.println();
		System.out.println("After: ");
		System.out.println(Arrays.toString(queueToArr(queue1)));
		
	}
}

/*

OUTPUT:
Before:
1
5
2
7
9
8

After:
[1, 5, 2, 7, 9, 8]


*/