/*

Diwali Assignment: Class, Objects, Variables, Methods & Constructors Coding Questions

Q3. Java Program to Illustrates Use of Instance Inner Class



*/

// Solution:

import java.lang.*;
import java.util.*;

public class Solution3
{
	public static void main(String[] args)
	{
		// Create an instance of a Outer class
		BankAccount bankAccount = new BankAccount("Amit", 25000.0, 5.20);
			
		// Call outer class method which use inner class method using object
		System.out.println("Outer Interest: " + bankAccount.getTotalInterest());  // Outer Interest: 1300.0
		
		
		// Create an instance of INNER class using bankAccount object
		BankAccount.Interest interest = bankAccount.new Interest();
		
		// call INNER class method
		System.out.println("Inner Interest: " + interest.calInterest());  // Inner Interest: 1300.0
		
		
	}
}

class BankAccount
{
	private String owner;
	private double balance;
	double interestPerYear;
	
	// Constructor
	public BankAccount(String owner, double balance, double interestPerYear)
	{
		this.owner = owner;
		this.balance = balance;
		this.interestPerYear = interestPerYear;
	}
	
	// getters
	public double getBalance()
	{
		return balance;
	}
	
	
	public double getTotalInterest()
	{
		// we can not use inner class methods and data members directly inside outer class
		// for that we need to create an object of inner class
		Interest i = new Interest();
		double totalInterest = i.calInterest();
		return totalInterest;
	}
	
	
	// Inner class creation
	class Interest
	{
		public double calInterest()
		{
			// we can use outer class data members and methods inside inner class directly
			return getBalance() * interestPerYear / 100;
		}
	}
	
}