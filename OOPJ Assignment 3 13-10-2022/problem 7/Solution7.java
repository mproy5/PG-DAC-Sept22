/* 

MODULE 2 OOPJ : ASSIGNMENT 3

Q4. Create a class called Author is designed as follows: 
	It contains: • three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’). • 
	One constructor to initialize the name, email and gender with the given values. 
	And, a class called Book is designed as follows: It contains: • Four private instance variables: name (String), author 
	(of the class Author you have just created), price (double), and qtyInStock (int). Assuming that each book is written 
	by one author. • One constructor which constructs an instance with the values given. • Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). 
	Again there is no setter for name 
	and author. Write the class Book (which uses the Author class written earlier). Try: 
	1.Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName()) 
	2. After obtaining the Author object, print the Author (name, email & gender) of the book.
 

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/

import java.lang.*;
import java.util.*;

enum Gender
{
	M, F;
}

public class Solution7
{
	public static void main(String[] args)
	{
		
		Book book = new Book("book1", new Author("auhor1", "author1@gmail.com", Gender.M), 520.0, 34);
		
		// Print Book Details
		System.out.println("Book Details: ");
		System.out.println("Book Name: " + book.getName());
		System.out.println("Author Details: " + book.getAuthor());
		System.out.println("Price: " + book.getPrice());
		System.out.println("Quantity In Stock: " + book.getQtyInStock());
		
		
		// Print Author Details
		System.out.println("Author Details: ");
		System.out.println("Author Name: " + book.author.getAuthorName());
		System.out.println("Author Email: " + book.author.getEmail());
		System.out.println("Author Gender: " + book.author.getGender());
		
		
		
	}
}

class Author
{
		// Data members
		String name;
		String email;
		Gender gender;
		
		// Constructor
		Author()
		{
			
		}
		
		Author(String name, String email, Gender gender)
		{
			this.name = name;
			this.email = email;
			this.gender = gender;
		}
		
		public String toString()
		{
			return "Author[name = " + name + ", email = " + email + ", Gender = " + gender + "]";
		}
		
		// Getters
		public String getAuthorName()
		{
			return this.name;
		}
		
		public String getEmail()
		{
			return this.email;
		}
		
		public Gender getGender()
		{
			return this.gender;
		}
		
}

class Book
{
	// Data Members
	String name;
	Author author;
	double price;
	int qtyInStock;
	
	// Constructor
	Book()
	{
		
	}
	
	Book(String name, Author author, double price, int qtyInStock)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	
	// Setters
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock = qtyInStock;
	}
	
	// Getters
	public String getName()
	{
		return this.name;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public double getPrice()
	{
		return price;
	}
		
	public int getQtyInStock()
	{
		return qtyInStock;
	}
}

/*
OUTPUT:

Book Details:
Book Name: book1
Author Details: Author[name = auhor1, email = author1@gmail.com, Gender = M]
Price: 520.0
Quantity In Stock: 34
Author Details:
Author Name: auhor1
Author Email: author1@gmail.com
Author Gender: M

*/