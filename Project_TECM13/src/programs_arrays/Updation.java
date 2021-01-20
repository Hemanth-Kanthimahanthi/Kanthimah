package programs_arrays;

import java.util.Scanner;

public class Updation 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=scan.nextInt();
		int[] a1=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<=a1.length-1;i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("Array index are from 0 to "+(a1.length-1));
		int index=scan.nextInt();
		System.out.println("Enter new element to update.........");
		int ele=scan.nextInt();
		System.out.println("Before Updating......");
		for(int x:a1)
		{
			System.out.print(x+" ");
		}
		a1[index]=ele;
		System.out.println("After Updating.......");
		for(int y:a1)
		{
			System.out.print(y+" ");
		}
	}
}
