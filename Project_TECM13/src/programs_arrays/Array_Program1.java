/*
 * Write a program to create double array to read the size and values during runtime
 * Print it by using For loop and For each loop
 */





package programs_arrays;

import java.util.Scanner;

public class Array_Program1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter Array Size......");
		int size =scan.nextInt();
		double[] d1=new double[size];
		System.out.println("Enter "+ size + " elements.....");
		for(int i=0;i<=d1.length-1;i++)
		{
			d1[i]=scan.nextDouble();
		}
		System.out.println("Array elements are..........");
		for(int i=0;i<=d1.length-1;i++)
		{
			System.out.println(d1[i]);
		}
		System.out.println("=================================================");
		for(double j:d1)
		{
			System.out.println(j);
		}
	}
}
