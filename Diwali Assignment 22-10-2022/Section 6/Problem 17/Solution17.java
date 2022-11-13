/*

Diwali Assignment: Collection coding questions:

Q17.  Write a Java program to convert a hash set to an array.

*/

// Solution:

import java.util.*;

public class Solution17
{
	
	public static void display(HashSet<String> list)
	{
		for(String x : list)
			System.out.println(x);
	}
	
	// Hash set to array
	public static String[] hashToArr(HashSet<String> list)
	{
		String[] strArr = new String[list.size()];
		int i = 0;
		
		for(String x : list)
		{
			strArr[i] = x;
			i++;
		}
		return strArr;
	}
	
	public static void main(String[] args)
	{
		HashSet<String> list1 = new HashSet<>();
		
		
		list1.add("Ram");
		list1.add("Anu");
		list1.add("Meet");
		list1.add("Krit");
		
		display(list1);
		
		System.out.println(Arrays.toString(hashToArr(list1)));
		
		
	
		
	}
}

/*

OUTPUT:
Krit
Meet
Anu
Ram
[Krit, Meet, Anu, Ram]

*/