/*

Diwali Assignment: Collection coding questions:

Q22.  Write a Java program to count the number of key-value (size) mappings in a map.

*/

// Solution:

import java.util.*;

public class Solution22
{	
	
	public static void main(String[] args)
	{
		HashMap<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "Pink");
		map1.put(2, "Orange");
		map1.put(3, "Yellow");
		map1.put(4, "Blue");
		map1.put(5, "Green");
		
		System.out.println("Size: " + map1.size());  // Size: 5
	}
}

/*

OUTPUT:
Size: 5


*/