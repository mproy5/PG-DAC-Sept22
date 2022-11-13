/*

Diwali Assignment: Collection coding questions:

Q25. Write a Java program to get the value of a specified key in a map.

*/

// Solution:

import java.util.*;

public class Solution25
{	
	
	
	public static void main(String[] args)
	{
		HashMap<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "Pink");
		map1.put(2, "Orange");
		map1.put(3, "Yellow");
		map1.put(4, "Blue");
		map1.put(5, "Green");
		
		System.out.println("Key 1 = " + map1.get(1));  // Key 1 = Pink
		
		
	}
}

/*

OUTPUT:
Key 1 = Pink

*/