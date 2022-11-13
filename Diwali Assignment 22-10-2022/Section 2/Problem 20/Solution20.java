/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q20.  String Constructor Program in Java.



*/

// Solution:

import java.lang.*;
import java.util.*;


public class Solution20
{
	public static void main(String args[])
	{
		// Default String Constructor
		String str1 = new String();
		System.out.println(str1);    // prints blank
		
		// Constructor -> String(String)
		String str2 = new String("Welcome");
		System.out.println(str2);   // Welcome
		
		// Constructor -> String(char[])
		char[] chArr = {'H', 'e', 'l', 'l', 'o'};
		String str3 = new String(chArr);
		System.out.println(str3);  // Hello
		
		// Constructor -> String(char[], int starting, int count)
		String str4 = new String(chArr, 1, 3);
		System.out.println(str4);  // ell
		
		// Constructor  -> String(byte[])
		byte[] byteArr = {65, 66, 67, 68, 69, 70};
		String str5 = new String(byteArr);
		System.out.println(str5);   // ABCDEF
		
		// Constructor  -> String(byte[], int starting, int count)
		String str6 = new String(byteArr, 2, 3);
		System.out.println(str6);   //  CDE
		
	}
}

