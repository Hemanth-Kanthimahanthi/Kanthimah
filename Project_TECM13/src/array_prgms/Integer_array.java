/*
 * Write a program to create an integer array, provide Array size and array elements during runtime 
&
 * print only these array elements which appears at even index number 
 */




package array_prgms;

import java.util.Scanner;

public class Integer_array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size      :");
		int size=sc.nextInt();
		int[] a1=new int[size];
		System.out.println("Enter " +size+" elements ");
		for(int x=0;x<=a1.length-1;x++)
		{
			a1[x]=sc.nextInt();;
		}
			System.out.println("Elements present @ even index are :");
		for(int y=0;y<=a1.length-1;y++)
		{
			if(y %2 ==0)
			{
				System.out.print(a1[y]);
			}
		}
	}
}
