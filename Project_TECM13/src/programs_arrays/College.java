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

//Derived Array type
package programs_arrays;

public class College 
{
	public static void main(String[] args) 
	{
		Student[] s1=new Student[4];//Student Array object
		s1[0]=new Student(22,"Nath",60.85);
		s1[1]=new Student(60,"Nath",61.85);
		s1[2]=new Student(61,"Natho",79.85);
		s1[3]=new Student(62,"Badrinath",64.85);
		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
		}
		System.out.println("===========For Each Loop===========");
		for(Student rv: s1)
		{
			System.out.println(rv);
		}
	}
}
