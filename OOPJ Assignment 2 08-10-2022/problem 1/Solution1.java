/* 

MODULE 2 OOPJ : ASSIGNMENT 2 

Q1. Implement a class for a Book. Book contains a title (a String), a list of authors (array of authors), number of 
pages (an integer), price (floating point number), publisher (a String) etc. Write suitable constructor and 
accessor/modifier methods. Implement a class for Library. A library contains a list of books (array of Book). 
Write add (to add a book) and remove (to delete a book) methods for library. Write a main() function to create a 
Library and add five Book to library. Print the total price of all books. 

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/


import java.lang.*;
import java.util.*;


public class Solution1
{
	public static void main(String[] args)
	{
		double totalPrice = 0;
		
		// Array of authors
		String[] book1Authors = {"author1", "author2"};
		String[] book2Authors = {"author3", "author5", "autho4"};
		String[] book3Authors = {"author1"};
		String[] book4Authors = {"author2", "author3"};
		String[] book5Authors = {"author1", "author5"};
		
		// Book object creation
		Book book1 = new Book("Book1", book1Authors, 220, 550.0, "publisher1");
		System.out.println(book1.getAuthors()[1]); // author2
		
		
		Book book2 = new Book();
		book2.setBook("Book2", book2Authors, 340, 675.0, "publisher2");
		
		Book book3 = new Book("Book3", book3Authors, 150, 269.0, "publisher3");
		Book book4 = new Book("Book4", book4Authors, 780, 820.0, "publisher4");
		Book book5 = new Book("Book5", book5Authors, 310, 125.4, "publisher5");
		
		// Library object creation
		Library lib1 = new Library();
		
		// add book to lib1
		lib1.addBook(book1);
		System.out.println(lib1.books[0].getPrice());  // 550.0
		
		// remove book from lib1
		lib1.removeBook();
		System.out.println(lib1.books[0]);  // null
		
		// add 5 books to lib1
		lib1.addBook(book1);
		lib1.addBook(book2);
		lib1.addBook(book3);
		lib1.addBook(book4);
		lib1.addBook(book5);
		
		// calculate totalPrice of 5 books
		for (int i = 0; i < lib1.books.length; i++)
		{
			totalPrice = totalPrice + lib1.books[i].getPrice();
		}
		
		// Print totalPrice of 5 books
		System.out.println(totalPrice); // 2439.4 = 550.0 + 675.0 + 269.0 + 820.0 +125.4
		
	}
}

class Book
{
	// Data members
	private String title;
	private String[] authors = new String[5];
	private int noOfPages;
	private double price;
	private String publisher;
	
	// Constructors
	
	Book()
	{
	
	}
	
	Book(String title, String[] authors, int noOfPages, double price, String publisher)
	{
		this.title = title;
		this.authors = authors;
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisher = publisher;
	}
	
	
	// Setter 
	public void setBook(String title, String[] authors, int noOfPages, double price, String publisher)
	{
		this.title = title;
		this.authors = authors;
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisher = publisher;
	}
	
	// Getters
	public String getTitle()
	{
		return this.title;
	}
	public String[] getAuthors()
	{
		return this.authors;
	}
	public int getNoOfPages()
	{
		return this.noOfPages;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String getPublisher()
	{
		return this.publisher;
	}
	
	
	
}


class Library
{
	// Array of Books
	Book[] books = new Book[5];
	int index = 0;
	
	// add a book into library
	void addBook(Book b)
	{
		books[index] = b;
		index++;
	}
	
	// remove a book from library
	void removeBook()
	{
		index--;
		books[index] = null;
	}
	
	
}

