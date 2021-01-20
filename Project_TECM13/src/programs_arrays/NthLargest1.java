package programs_arrays;

import java.util.Scanner;

public class NthLargest1 
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
		System.out.println("Enter nth Largest element which is to be found");
		int n=scan.nextInt();
		int greaterThan=a1.length-n;
		for(int i=0;i<=a1.length-1;i++)
		{
			int count=0;
			for(int j=0;j<=a1.length-1;j++)
			{
				if(a1[i]>a1[j])
				{
					count++;
				}
			}
			if(count==greaterThan)
			{
				System.out.println(n+" nth largest is "+a1[i]);
			}
		}
	}
}
