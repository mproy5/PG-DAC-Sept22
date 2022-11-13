/*

Diwali Assignment: Collection coding questions:

Q24. Write a Java program to check whether a map contains key-value mappings (empty) or
not.

*/

// Solution:

import java.util.*;

public class Solution24
{	
	
	
	public static void main(String[] args)
	{
		HashMap<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "Pink");
		map1.put(2, "Orange");
		map1.put(3, "Yellow");
		map1.put(4, "Blue");
		map1.put(5, "Green");
		
		System.out.println("Map is empty? " + map1.isEmpty());
		
		HashMap<Integer, String> map2 = new HashMap<>();
		System.out.println("Map is empty? " + map2.isEmpty());
	}
}

/*

OUTPUT:
Map is empty? false
Map is empty? true

*/