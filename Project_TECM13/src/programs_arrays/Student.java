/*
 * Write a Program to create a class STUDENT
 * STUDENT attributes are id,name,marks
 * Create a Constructor with arguments
 * Return id,name,marks are useful information
 * 
 * create a Class COLLEGE which has main method
 * create Student[] object with size 4
 * create student object and store it in array
 * Print each and every student's information by using normal for loop and for each loop
 */


package programs_arrays;

public class Student
{
	int id;
	String name;
	double marks;
	public Student(int id, String name, double marks) 
	{
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString()
	{
		return "Id :"+this.id+" Name :"+this.name+" Marks:"+this.marks;
	}
}
