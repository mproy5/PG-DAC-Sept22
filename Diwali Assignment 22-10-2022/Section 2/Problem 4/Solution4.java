/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q4. Java Program to Illustrates Use of Static Inner Class.


*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution4
{
	public static void main(String[] args)
	{
		// Create an instance of a Outer class
		BankAccount bankAccount = new BankAccount("Amit", 25000.0, 5.20);
			
		// Call outer class method which use inner class method using object
		System.out.println("Outer Interest: " + bankAccount.getTotalInterest());  // Outer Interest: 1300.0
		
		
		// Create instance of Static Inner class -> Here we don't need outer class object
		BankAccount.Interest interest = new BankAccount.Interest();
		
		// call Non Static Method from static inner class using object
		System.out.println("Inner Interest: " + interest.calInterest());  // Inner Interest: 1300.0
		
		// call Static Inner class Static method directly
		BankAccount.Interest.printInterstRate();  // Static Method InterestRate: 5.2
		
		
	}
}

class BankAccount
{
	private String owner;
	private static double balance;
	static double interestPerYear;
	
	// Constructor
	public BankAccount(String owner, double balance, double interestPerYear)
	{
		this.owner = owner;
		this.balance = balance;
		this.interestPerYear = interestPerYear;
	}
	
	// getters
	public static double getBalance()
	{
		return balance;
	}
	
	
	public double getTotalInterest()
	{
		// we can not use inner class methods and data members directly inside outer class
		// for that we need to create an object of inner class
		Interest i = new Interest();
		double totalInterest = i.calInterest();
		// return Interest.calInterest();
		return totalInterest;
	}
	
	
	// Static Inner class creation
	static class Interest
	{
		public double calInterest()
		{
			// we can use outer class data members and methods inside inner class directly
			return getBalance() * interestPerYear / 100;
		}
		
		public static void printInterstRate()
		{
			System.out.println("Static Method InterestRate: " + interestPerYear);
		}
	}
	
}
