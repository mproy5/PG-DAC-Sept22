/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q26. Java Program to Calculate Sum of Two Byte Values using Type Casting.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution26
{
	public static void main(String args[])
	{
		int add = MathOperation.addition((byte)5, (byte)3 );
		System.out.println("Addition: " + add);  // Addition: 8
	}
}


class MathOperation
{
	public static int addition(byte x, byte y)
	{
		return  x + y;
	}
}