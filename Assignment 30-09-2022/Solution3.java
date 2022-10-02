/*
* 03.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
* Take the obtained marks from user using Scanner class. 
* Output should be in this format [ percentage marks = 99 % ]. 
* Use concatenation operator here.
*/


// Author  : Mahendra Pratap Roy
// PRN No. : 220940320060

// Import 
import java.util.*;




class Marks
{
	// Instance Variable
	int module1;
	int module2;
	int module3;
	int module4;
	int module5;
	int sum;
		
	// Constructor
	Marks(int module1, int module2, int module3, int module4, int module5)
	{
		this.module1 = module1;
		this.module2 = module2;
		this.module3 = module3;
		this.module4 = module4;
		this.module5 = module5;
	}
		
	// Methods
		
	int calSum()
	{
		return this.sum = module1 + module2 + module3 + module4 + module5; 
	}
		
	double calAvg()
	{
		return sum/5.0;
	}
		
	}
	
public class Solution3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		// Take Input
		System.out.println("Type Your marks out of 100:");
		
		System.out.print("Module 1: ");
		int module1 = sc.nextInt();
		System.out.print("Module 2: ");
		int module2 = sc.nextInt();
		System.out.print("Module 3: ");
		int module3 = sc.nextInt();
		System.out.print("Module 4: ");
		int module4 = sc.nextInt();
		System.out.print("Module 5: ");
		int module5 = sc.nextInt();
		
		
		// Instantiate Object
		Marks marks1 = new Marks(module1, module2, module3, module4, module5);
		
		// Get values
		int sum = marks1.calSum();
		double avg = marks1.calAvg();
		
		// Print
		
		System.out.println("Sum: " + sum);
		System.out.printf("Average = %.1f %%\n", avg);
		
		
	
	}
}