/* 

MODULE 2 OOPJ : ASSIGNMENT 3

Q2. Write a class for Account containing data members accountNumber, holderName, balance and add 
constructors and necessary accessor/modifier functions for these data members. Now create two class 
SavingsAccount and CurrentAccount extending from this class. SavingsAccount will have a member 
variable interestRate and member function calculateYearlyInterest. Write another class Manager that 
contains a list Account. Also write a main() function to create an instance of Manager class. Add two 
SavingsAccount and three CurrentAccount to Manager. Calculate interest of each SavingsAccount. Print 
the details of all accounts. 



Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/

import java.lang.*;
import java.util.*;


// MAIN CLASS
public class Solution2
{
	public static void main(String[] args)
	{
		// Instance of Manager
		Manager manager1 = new Manager();
		
		// Instance of SavingsAccount
		SavingsAccount sa1 = new SavingsAccount(2345, "Amit", 58000.0);
		SavingsAccount sa2 = new SavingsAccount(2432, "Mala", 75000.0);
		SavingsAccount sa3 = new SavingsAccount(2728, "John", 41000.0);
		
		// Instance CurrentAccount
		CurrentAccount ca1 = new CurrentAccount(5342, "Mohan", 25000.0);
		CurrentAccount ca2 = new CurrentAccount(5761, "Arul", 35000.0);
		
		// Add Savings Account to manager
		manager1.addAccount(sa1);
		manager1.addAccount(sa2);
		manager1.addAccount(sa3);
		
		// Add Current Account to manager
		manager1.addAccount(ca1);
		manager1.addAccount(ca2);
		
		// Calculate Interest and Print Details of all accounts
		manager1.getAccountDetails();
		
	}
}


// ACCOUNT CLASS
abstract class Account
{
	// Data members
	private int accountNumber;
	private String holderName;
	private double balance;
	
	// Constructors
	Account()
	{
		
	}
	
	Account(int accountNumber, String holderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	// Modifiers
	public void setBalance(double balnce)
	{
		this.balance = balnce;
	}
	
	// Accessors
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getHolderName()
	{
		return holderName;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public abstract void printDetails();
	
}


// SAVINGS ACCOUNT NCLASS
class SavingsAccount extends Account
{
	// Data Members
	private double interestRate;
	
	// Cond=structors
	SavingsAccount() 
	{
		
	}
	
	SavingsAccount(int accountNumber, String holderName, double balance)
	{
		super(accountNumber, holderName, balance);
		this.interestRate = 5.2;  // Savings Account Interest Rate is 5.2%.
	}
	
	// Methods
	public double calculateYearlyInterest()
	{
		double balance = super.getBalance();
		double interest = balance * this.interestRate / 100;
		return interest;
	}
	
	// Print Details
	public void printDetails()
	{
		System.out.println("Account Number: " + super.getAccountNumber());
		System.out.println("Account Holder Name: " + super.getHolderName());
		System.out.println("Account Balance: " + super.getBalance());
		System.out.println("Account Type: Savings Account");
		System.out.println("Interest: " + calculateYearlyInterest());
	}
	
	
}

// CURRENT ACCOUNT CLASS
class CurrentAccount extends Account
{
	// Data Members
	private double interestRate;
	
	// Cond=structors
	CurrentAccount() 
	{
		
	}
	
	CurrentAccount(int accountNumber, String holderName, double balance)
	{
		super(accountNumber, holderName, balance);
		this.interestRate = 6.2; // Current Account Interest Rate is 6.2%.
	}
	
	// Methods
	public double calculateYearlyInterest()
	{
		double balance = super.getBalance();
		double interest = balance * this.interestRate / 100;
		return interest;
	}
	
	// Print Details
	public void printDetails()
	{
		System.out.println("Account Number: " + super.getAccountNumber());
		System.out.println("Account Holder Name: " + super.getHolderName());
		System.out.println("Account Balance: " + super.getBalance());
		System.out.println("Account Type: Current Account");
		System.out.println("Interest: " + calculateYearlyInterest());
	}
}

// MANAGER CLASS
class Manager
{
	private Account[] account = new Account[100];
	int index = 0;
	
	// Methods
	public void addAccount(Account account)
	{
		this.account[index] = account;
		index++;
	}

	public void getAccountDetails()
	{
		for (int i =0; i < index; i++)
		{
			account[i].printDetails();
			System.out.println();
		}
		
	}
}

/*
OUTPUT:

Account Number: 2345
Account Holder Name: Amit
Account Balance: 58000.0
Account Type: Savings Account
Interest: 3016.0

Account Number: 2432
Account Holder Name: Mala
Account Balance: 75000.0
Account Type: Savings Account
Interest: 3900.0

Account Number: 2728
Account Holder Name: John
Account Balance: 41000.0
Account Type: Savings Account
Interest: 2132.0

Account Number: 5342
Account Holder Name: Mohan
Account Balance: 25000.0
Account Type: Current Account
Interest: 1550.0

Account Number: 5761
Account Holder Name: Arul
Account Balance: 35000.0
Account Type: Current Account
Interest: 2170.0

*/