package array_prgms;

import java.util.Scanner;

public class MissingElements 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size      :");
		int size=scan.nextInt();
		int[] a1 = new int[size];
		System.out.println("Enter "+ size + " elements :");
		for(int i=1;i<=a1.length-1;i++)
		{
			int status=0;
			for(int j=0;j<=a1.length-1;j++)
			{
				if(i==a1[j])
				{
					status=1;
					break;
				}
			}
			if(status==0)
			{
				System.out.println(i);
			}
		}
	}
}
