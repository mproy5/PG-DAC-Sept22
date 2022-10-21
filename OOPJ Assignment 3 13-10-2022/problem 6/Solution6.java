/* 

MODULE 2 OOPJ : ASSIGNMENT 3

Q6. A bookshop maintains the inventory of books that are being sold at the shop. The list includes details such 
as author, title, publisher, cost and stock position. Whenever a customer wants a book, the sales person 
inputs the title and author and the system searches the list and displays whether it is available or not. If it is 
not, an appropriate message is displayed. If it is, then the system displays the book details and details and 
requests for the number of copies required. If the required copies are available, the total cost of the 
requested copies is displayed, otherwise the message requires copies not in stock is displayed. Design a 
system using a class called Book with suitable member methods and constructors.  
 

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/

import java.lang.*;
import java.util.*;

public class Solution6
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// Create BookShop instance
		BookShop bs = new BookShop();
		bs.addBook("title1", "author1", "publisher1", 340.0, 5);
		bs.addBook("title2", "author2", "publisher2", 210.0, 3);
		
		// Input from user
		System.out.print("Enter Title: ");
		String title = sc.next();
		System.out.print("Enter Author: ");
		String author = sc.next();
		
		// Search for title and author
		String searchResult = bs.searchBook(title, author);

		// Condition check for book is found or not
		if (searchResult.equals("Book not found."))
		{
			System.out.println("Book not found.");
			System.exit(0);
		}
		
		// Input for copies
		System.out.print("How many copies required: ");
		int copies = sc.nextInt();
		
		// Search for copies available
		String price = bs.searchStock(title, author, copies);
		
		// Condition for copies found or not
		if(price.equals("Out of stock."))
		{
			System.out.println("Requires copies not in stock.");
			System.exit(0);
		}
		
		// If copies found display total price
		System.out.println("Total Price: " + price);
		
		
		
		
	}
}

class Book
{
	// Data Members
	private String title;
	private String author;
	private String publisher;
	private double cost;
	private int stock;
	
	// Constructor
	Book()
	{
		
	}

	Book(String title, String author, String publisher, double cost, int stock)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.cost = cost;
		this.stock = stock;
	}
	
	// getters
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public int getStock()
	{
		return stock;
	}
	
	// toString() oveeride
	public String toString()
	{
		return "Book[Title: " + title + ", Author: " + author + ", Publisher: " + publisher + ", Price: " + cost + ", Stock: " + stock + "]";
	}
	
}

class BookShop
{
	// Data Members
	ArrayList<Book> books = new ArrayList<>();
	
	// add
	public void addBook(String title, String author, String publisher, double cost, int stock)
	{
		books.add(new Book(title, author, publisher, cost, stock));
	}
	
	// search by title and author
	public String searchBook(String title, String author)
	{
		for (Book book : books)
		{
			if(book.getTitle().equals(title) && book.getAuthor().equals(author))
			{
				return book.toString();
			}
			
		}
		return "Book not found.";
	
	}
	
	// search stock
	public String searchStock(String title, String author, int copies)
	{
		for (Book book : books)
		{
			if(book.getTitle().equals(title) && book.getAuthor().equals(author) && book.getStock() >= copies)
			{
				return String.valueOf(book.getCost() * copies);
			
			
			}
		}
		
		return "Out of stock.";
	}
	
	
	
	
}