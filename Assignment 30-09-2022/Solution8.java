/*
* 08.	In a company an employee is paid as under: 
* If his basic salary is less than Rs. 10000, 
* then HRA = 10% of basic salary and DA = 90% of basic salary. 
* If his salary is either equal to or above Rs. 10000, 
* then HRA = Rs. 2000 and DA = 98% of basic salary. 
* If the employee's salary is input by the user 
* write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]
*/

// Author  : Mahendra Pratap Roy
// PRN No. : 220940320060



// Import 
import java.util.*;


class Employee
{
	int salary;
	
	Employee(int salary)
	{
		this.salary = salary;
	}
	
	// Salary calculator
	double salaryCal()
	{
		double hra = 2000;
		double da = 1;
		
		if(this.salary<10000)
		{
			hra = 10 * salary / 100;
			da = 90 * salary / 100;
		}
		else
		{
			da = 98 * salary / 100;
		}
		
		return salary + hra + da;
		
	}
}

	
public class Solution8
{

		
	public static void main(String args[])
	{
		
		
		Scanner sc = new Scanner(System.in);
		
		// Take input
		System.out.print("Enter Your Basic Salary : ");
		int salary = sc.nextInt();
		
		// Calculate gross salary
		Employee emp1 = new Employee(salary);
		
		double grossSalary = emp1.salaryCal();
		
		// Print
		System.out.println("Your Gross Salary : "+grossSalary);
		
	
	}
}