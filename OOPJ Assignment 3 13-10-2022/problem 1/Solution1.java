/* 

MODULE 2 OOPJ : ASSIGNMENT 3

Q1. Create an abstract class Publication with data members noOfPages, price, publisherName etc. with 
their accessor/modifier functions. Now create two sub-classes Book and Journal. Create a class 
Library that contains a list of Publications. Write a main() function and create three Books and two 
Journals, add them to library and print the details of all publications. 


Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/




import java.lang.*;
import java.util.*;



public class Solution1
{
	public static void main(String[] args)
	{	
		// Create 3 Books
		Book b1 = new Book();
		b1.setBook("book1", 100, 500.0, "publisher1");
		
		Book b2 = new Book();
		b2.setBook("book2", 300, 800.0, "publisher2");
		
		Book b3 = new Book();
		b3.setBook("book3", 50, 150.0, "publisher3");
		
		// Create 2 Journals
		Journal j1 = new Journal();
		j1.setJournal("journal1", 60, 400.0, "publisher4");
		
		Journal j2 = new Journal();
		j2.setJournal("journal2", 180, 275.25, "publisher5");
		
		// Add to Library
		Library l1 = new Library(5);
		l1.add(0, b1);
		l1.add(1, b2);
		l1.add(2, b3);
		l1.add(3, j1);
		l1.add(4, j2);
		
		
		// Print from Library
		l1.printAllPublication();
		
	}
}


abstract class Publication
{
	// Properties
	int noOfPages;
	double price;
	String publisherName;
	
	// 0-arg Constructor
	Publication()
	{
		
	}
	
	// 3-arg Constructor
	Publication(int noOfPages, double price, String publisherName)
	{
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
	}
	
	// Data Modifier
	void setPublication(int noOfPages, double price, String publisherName)
	{	
		this.noOfPages = noOfPages;
		this.price = price;
		this.publisherName = publisherName;
	}
	
	abstract void printDetails();
	
	
} 

class Book extends Publication
{
	private String bookTitle;
	
	void setBook(String bookTitle, int noOfPages, double price, String publisherName)
	{
		this.bookTitle = bookTitle;
		super.setPublication(noOfPages, price, publisherName);
		
	}
	
	void printDetails()
	{	
		System.out.println("Title of Book: " + bookTitle);
		System.out.println("Pages: " + noOfPages);
		System.out.println("Price: " + price);
		System.out.println("Publisher: " + publisherName);
	}
	
}


class Journal extends Publication
{
	private String journalTitle;
	
	void setJournal(String journalTitle, int noOfPages, double price, String publisherName)
	{
		this.journalTitle = journalTitle;
		super.setPublication(noOfPages, price, publisherName);
		
	}
	
	void printDetails()
	{	
		System.out.println("Title of Journal: " + journalTitle);
		System.out.println("Pages: " + noOfPages);
		System.out.println("Price: " + price);
		System.out.println("Publisher: " + publisherName);
	}
}

class Library
{	
	// List of Publication
	int numberOfPublication;
	Publication[] publicationName;
	
	Library (int numberOfPublication)
	{
		this.numberOfPublication = numberOfPublication;
		publicationName = new Publication[numberOfPublication];
	}
	
	// Add Publication
	void add(int i, Publication p)
	{
		publicationName[i] = p;
	}
	
	void printAllPublication()
	{
		for (int i = 0; i<publicationName.length; i++)
		{
			publicationName[i].printDetails();
			System.out.println();
		}
			
	}
	
	
}

/*
OUTPUT:

Pages: 100
Price: 500.0
Publisher: publisher1

Title of Book: book2
Pages: 300
Price: 800.0
Publisher: publisher2

Title of Book: book3
Pages: 50
Price: 150.0
Publisher: publisher3

Title of Journal: journal1
Pages: 60
Price: 400.0
Publisher: publisher4

Title of Journal: journal2
Pages: 180
Price: 275.25
Publisher: publisher5

*/