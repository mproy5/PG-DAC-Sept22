/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q25. Java Program to Check Whether Which One is Executed First, Static Block or the Static Method.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution25
{
	public static void main(String args[])
	{
		Test.staticMethod();
		/*
		OUTPUT:
		Static block executed
		Static Method executed
		*/
	}
}

class Test
{
	
	// Method
	public static void staticMethod()
	{
		System.out.println("Static Method executed");
	}
	
	
	static
	{
		System.out.println("Static block executed");
	}
	

	
}