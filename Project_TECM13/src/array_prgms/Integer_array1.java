/*
 * Write a program to create an integer array, provide Array size and array elements during runtime 
&
 * Search whether given element is present in array or not
 */





package array_prgms;

import java.util.Scanner;

public class Integer_array1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size      :");
		int size=scan.nextInt();
		int[] a1 = new int[size];
		System.out.println("Enter "+ size + " elements :");
		int searchelement=scan.nextInt();
		int status=0;
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=scan.nextInt();
		}
			System.out.println();
		for(int j=0;j<=a1.length-1;j++)
		{
			if(a1[j]==searchelement)
			{
				status=1;
				break;
			}
			if(status==1)
			{
				System.out.println("Element is not found");
			}
		}
	}
}
