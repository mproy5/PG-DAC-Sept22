/*

Diwali Assignment: Collection coding questions:

Q16.  Write a Java program to empty an hash set.

*/

// Solution:

import java.util.*;

public class Solution16
{
	
	public static void display(HashSet<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	
	
	public static void main(String[] args)
	{
		HashSet<String> list1 = new HashSet<>();
		
		
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		display(list1);
		
		// Empty an Hash set
		list1.clear();
		System.out.println();
		System.out.println("After:");
		display(list1);
		
		
	
		
	}
}

/*

OUTPUT:
Krit
Meet
Anu
Ram

After:


*/