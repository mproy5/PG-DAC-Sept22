import java.util.*;

public class ListSortDemo
{
	static void display(List<Student> list)
	{
		Iterator<Student> it = list.iterator();
		while (it.hasNext())
		{
			Student s = it.next();
			System.out.println(s);
		}
		
		
	}
	
	public static void main(String args[])
	{
		List<Student> list1 = new ArrayList<Student>();
		
		list1.add(new Student(14, "Amit", 85.0, 21));
		list1.add(new Student(28, "John", 75.0, 11));
		list1.add(new Student(5, "Ram", 64.0, 18));
		list1.add(new Student(21, "Manu", 90.0, 15));
		
		System.out.println("----------- by marks default --------");
		Collections.sort(list1);
		display(list1);
		
		System.out.println("----------- by age comparator --------");
		Collections.sort(list1, new StudentAgeComparator());
		display(list1);
		
		System.out.println("----------- by marks default REVERSE order --------");
		Collections.sort(list1, Collections.reverseOrder());
		display(list1);	
		
		System.out.println("----------- by age comparator in REVERSE--------");
		Collections.sort(list1, Collections.reverseOrder(new StudentAgeComparator()));
		display(list1);	
		
		
	}
}

class Student implements Comparable<Student>
{
	int roll;
	String name;
	double marks;
	int age;
	
	Student()
	{
		
	}
	
	Student(int roll, String name, double marks, int age)
	{
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.age = age;
		
	}
	
	// Oveeride toString() method of Object class
	public String toString()
	{
		return "Roll: " + roll + ", Name: " + name + ", Marks: " + marks + ", Age: " + age;
	}
	
	// Define compareTo() method of Comparable Interface 
	public int compareTo(Student s)
	{
		if (this.marks > s.marks)
			return 1;
		if (this.marks < s.marks)
			return -1;
		
		return 0;
	}
}

class StudentAgeComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		if (s1.age > s2.age)
			return 1;
		if (s1.age < s2.age)
			return -1;
		
		return 0;
	}
}

/*
OUTPUT:
----------- by marks default --------
Roll: 5, Name: Ram, Marks: 64.0, Age: 18
Roll: 28, Name: John, Marks: 75.0, Age: 11
Roll: 14, Name: Amit, Marks: 85.0, Age: 21
Roll: 21, Name: Manu, Marks: 90.0, Age: 15
----------- by age comparator --------
Roll: 28, Name: John, Marks: 75.0, Age: 11
Roll: 21, Name: Manu, Marks: 90.0, Age: 15
Roll: 5, Name: Ram, Marks: 64.0, Age: 18
Roll: 14, Name: Amit, Marks: 85.0, Age: 21
----------- by marks default REVERSE order --------
Roll: 21, Name: Manu, Marks: 90.0, Age: 15
Roll: 14, Name: Amit, Marks: 85.0, Age: 21
Roll: 28, Name: John, Marks: 75.0, Age: 11
Roll: 5, Name: Ram, Marks: 64.0, Age: 18
----------- by age comparator in REVERSE--------
Roll: 14, Name: Amit, Marks: 85.0, Age: 21
Roll: 5, Name: Ram, Marks: 64.0, Age: 18
Roll: 21, Name: Manu, Marks: 90.0, Age: 15
Roll: 28, Name: John, Marks: 75.0, Age: 11
*/