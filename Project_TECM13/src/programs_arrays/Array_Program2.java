/*
 * Write a program to create character array to read the size and values during runtime
 * Print in reverse order
 */




package programs_arrays;

import java.util.Scanner;

public class Array_Program2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter Array Size......");
		int size =scan.nextInt();
		char[] ch=new char[size];
		System.out.println("Enter "+ size + " elements.....");
		for(int i=0;i<=ch.length-1;i++)
		{
			ch[i]=scan.next().charAt(0);
		}
		System.out.println("Array elements in reverse order are as below");
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
	}

}
