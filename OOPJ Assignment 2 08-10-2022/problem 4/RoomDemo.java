/* 

MODULE 2 OOPJ : ASSIGNMENT 2 

Q4. Create a class Room which will hold the height, width and breadth of the room in three fields. This class 
also has a method volume() to calculate the volume of this room. Create another class RoomDemo which will 
use the earlier class, create instances of rooms, and display the volume of room.

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/


import java.lang.*;
import java.util.*;


public class RoomDemo
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter height of room: ");
		double height = sc.nextDouble();
		System.out.println("Enter width of room: ");
		double width = sc.nextDouble();
		System.out.println("Enter breadth of room: ");
		double breadth = sc.nextDouble();
	
		// Instance of Room
		Room room = new Room();
		room.setRoom(height, width, breadth);
		
		double volume = room.calVolume();
		
		// Display volume of room
		System.out.printf("Volume: %.2f \n", volume); 
		
		
	}
}

class Room
{
	// Data Members
	private double height;
	private double width;
	private double breadth;
	
	// Methods
	
	// setter
	void setRoom(double height, double width, double breadth)
	{
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	
	// Calculate Volume
	double calVolume()
	{
		return height * width * breadth;
	}
}