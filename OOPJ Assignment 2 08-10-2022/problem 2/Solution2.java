/* 

MODULE 2 OOPJ : ASSIGNMENT 2 

Q2. Implement a class for DateDemo. Write member functions for (i) getting the previous day, (iv) getting the next 
day, (iii) printing a day There should be four constructors: (i) day, month and year are initialized to 01, 01, 1970; (ii) 
day is initialized to user specified value but month and year are initialized to 01, 1970; (iii) day, month are 
initialized to user specified value but year is initialized to 1970; (iv) day, month and year are initialized to user 
defined values. Also, write a main() function to (i) create a date object; (ii) print the next and the previous day. 

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/


import java.lang.*;
import java.util.*;


public class Solution2
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Input from user
		System.out.println("Enter Day: ");
		String day = sc.next();
		System.out.println("Enter Month: ");
		String month = sc.next();
		System.out.println("Enter Year: ");
		String year = sc.next();
		
		// Object cretion and pass the input
		DateDemo dateDemo = new DateDemo(day, month, year);
		
		// Print Given Day
		dateDemo.printDay();
		// Print Next Day
		dateDemo.prinNexttDay();
		// Print Previous Day
		dateDemo.printPreDay();
		
	}
}


class DateDemo
{
	// Data Members
	String day;
	String month;
	String year;
	
	// Constructors
	DateDemo()
	{
		this.day = "01";
		this.month = "01";
		this.year = "1970";
	}
	
	DateDemo(String day)
	{
		this.day = day;
		this.month = "01";
		this.year = "1970";
	}
	
	DateDemo(String day, String month)
	{
		this.day = day;
		this.month = month;
		this.year = "1970";
	}
	
	DateDemo(String day, String month, String year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	
	
	// Methods
	
	// Get next day
	String getNextDay()
	{
		// Local Variables
		String day = this.day;
		String month = this.month;
		String year = this.year;
		
		if (day.equals("30") && month.equals("12"))
		{
			day = "01";
			month = "01";
			
			// Increase the year by 1
			int temp = Integer.parseInt(year);
			temp++;
			year = "" + temp;
			
			return "" + day + "/" + month + "/" + year;
			
		}
		
		if (day.equals("30"))
		{
			day = "01";
			
			// Increase the month by 1
			int temp = Integer.parseInt(month);
			temp++;
			month = String.format("%02d", temp);
			
			return "" + day + "/" + month + "/" + year;
		}
		
		// Increase the day by 1
		int temp = Integer.parseInt(day);
		temp++;
		day = String.format("%02d", temp);
		
		
		return "" + day + "/" + month + "/" + year;
		
	}
	
	// Get Previous day
	String getPreDay()
	{
		// Local Variables
		String day = this.day;
		String month = this.month;
		String year = this.year;
		
		if (day.equals("01") && month.equals("01"))
		{
			day = "30";
			month = "12";
			
			// Decrease the year by 1
			int temp = Integer.parseInt(year);
			temp--;
			year = "" + temp;
			
			return "" + day + "/" + month + "/" + year;
		}
		
		if (day.equals("01"))
		{
			day = "30";
			
			// Decraese the month by 1
			int temp = Integer.parseInt(month);
			temp--;
			month = String.format("%02d", temp);
			
			return "" + day + "/" + month + "/" + year;
		}
		
		// Decrease the day by 1
		int temp = Integer.parseInt(day);
		temp--;
		day = String.format("%02d", temp);
		
		
		return "" + day + "/" + month + "/" + year;
	}
	
	// Print user given date
	void printDay()
	{
		System.out.println("Given Day: " + this.day + "/" + this.month + "/" + this.year);
	}
	
	// Print next day
	void prinNexttDay()
	{
		System.out.println("Next Day: " + getNextDay());
	}
	
	// Print previous day
	void printPreDay()
	{
		System.out.println("Previous Day: " + getPreDay());
	}
}