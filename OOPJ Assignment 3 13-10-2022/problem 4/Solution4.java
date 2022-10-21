/* 

MODULE 2 OOPJ : ASSIGNMENT 3

Q4. Create a base class Automobile. An Automobile contains data members make, type, maxSpeed, 
price, mileage, registrationNumber etc. with their reader/writer methods. Now create two sub-classes 
Track and Car. Track has data members capacity, hoodType, noOfWheels etc. Car has data 
members noOfDoors, seatingCapacity and their reader/writer methods. Create a main() function to 
demonstrate this. 
 

Authhor : Mahendra Pratap Roy
PRN : 220940320060


*/

import java.lang.*;
import java.util.*;

public class Solution4
{
	public static void main(String[] args)
	{
		// Create instances of Car
		Car car1 = new Car();
		car1.setCar("car1", "maker1", 120, 500000.0, 21.7, "IN98-7654", 2, 4);
		Car car2 = new Car();
		car2.setCar("car2", "maker2", 150, 800000.0, 15.2, "IN29-3217", 4, 6);
		
		// Create instances of Track
		Track track1 = new Track();
		track1.setTrack("track1", "maker5", 90, 1500000.0, 8.7, "IN45-8976", 120.0, "hood1", 10);
		Track track2 = new Track();
		track1.setTrack("track2", "maker4", 60, 1100000.0, 6.5, "IN61-5213", 80.0, "hood2", 8);
		
		// Print
		car1.printDetails();
		car2.printDetails();
		track1.printDetails();
		track2.printDetails();
		
	}
}

class Automobile
{
	// Data Members
	private String name;
	private String make;
	private int maxSpeed;
	private double price;
	private double mileage;
	private String registrationNumber;
	
	// Constructors
	Automobile()
	{
		
	}
	
	// setter
	public void setAutomobile(String name, String make, int maxSpeed, double price, double mileage, String registrationNumber)
	{
		this.name = name;
		this.make = make;
		this.maxSpeed = maxSpeed;
		this.price =price;
		this.mileage = mileage;
		this.registrationNumber = registrationNumber;
	}
	
	// getters
	public String getName()
	{
		return name;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getMaxSpeed()
	{
		return maxSpeed;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public double getMileage()
	{
		return mileage;
	}
	
	public String getRegistrationNumber()
	{
		return registrationNumber;
	}	
		
}

class Track extends Automobile
{
	// Data Members
	private double capacity;
	private String hoodType;
	private int noOfWheels;
	
	// Constructor
	Track()
	{
		
	}
	
	// setter
	public void setTrack(String name, String make, int maxSpeed, double price, double mileage, String registrationNumber, double capacity, String hoodType, int noOfWheels)
	{
		setAutomobile(name, make, maxSpeed, price, mileage, registrationNumber);
		this.capacity = capacity;
		this.hoodType = hoodType;
		this.noOfWheels = noOfWheels;
	}
	
	// getter
	public double getCapacity()
	{
		return capacity;
	}
	
	public String getHoodType()
	{
		return hoodType;
	}
	
	public int getNoOfWheels()
	{
		return noOfWheels;
	}
	
	// Print
	public void printDetails()
	{
		System.out.println("Category: Track");
		System.out.println("Name: " + getName());
		System.out.println("Maker: " + getMake());
		System.out.println("Maximum Speed: " + getMaxSpeed());
		System.out.println("Mileage: " + getMileage());
		System.out.println("Registration Number: " + getRegistrationNumber());
		System.out.println("Capacity: " + getCapacity());
		System.out.println("Hood Type: " + getHoodType());
		System.out.println("Number of Wheels: " + getNoOfWheels());
		System.out.println("----------------------------------------------------");
		
	}
	
}

class Car extends Automobile
{
	// Data Members
	private int noOfDoors;
	private int seatingCapacity;
	
	// Constructor
	Car()
	{
		
	}
	
	// setter
	public void setCar(String name, String make, int maxSpeed, double price, double mileage, String registrationNumber, int noOfDoors, int seatingCapacity)
	{
		setAutomobile(name, make, maxSpeed, price, mileage, registrationNumber);
		this.noOfDoors = noOfDoors;
		this.seatingCapacity = seatingCapacity;
	}
	
	// getter
	public int getNoOfDoors()
	{
		return noOfDoors;
	}
	
	public int getSeatingCapacity()
	{
		return seatingCapacity;
	}
	
	// Print
	public void printDetails()
	{
		System.out.println("Category: Car");
		System.out.println("Name: " + getName());
		System.out.println("Maker: " + getMake());
		System.out.println("Maximum Speed: " + getMaxSpeed());
		System.out.println("Mileage: " + getMileage());
		System.out.println("Registration Number: " + getRegistrationNumber());
		System.out.println("Number of Doors: " + getNoOfDoors());
		System.out.println("Seating Capacity: " + getSeatingCapacity());
		System.out.println("----------------------------------------------------");
		
	}
	
}

/*
OUTPUT:

Category: Car
Name: car1
Maker: maker1
Maximum Speed: 120
Mileage: 21.7
Registration Number: IN98-7654
Number of Doors: 2
Seating Capacity: 4
----------------------------------------------------
Category: Car
Name: car2
Maker: maker2
Maximum Speed: 150
Mileage: 15.2
Registration Number: IN29-3217
Number of Doors: 4
Seating Capacity: 6
----------------------------------------------------
Category: Track
Name: track2
Maker: maker4
Maximum Speed: 60
Mileage: 6.5
Registration Number: IN61-5213
Capacity: 80.0
Hood Type: hood2
Number of Wheels: 8
----------------------------------------------------
Category: Track
Name: null
Maker: null
Maximum Speed: 0
Mileage: 0.0
Registration Number: null
Capacity: 0.0
Hood Type: null
Number of Wheels: 0
----------------------------------------------------

*/