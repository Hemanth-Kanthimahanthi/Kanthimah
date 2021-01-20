package string_programs;

import java.util.Scanner;

public class Count_Words 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String data");
		String S=sc.nextLine();
		int count=0;
		String[] Sarr=S.split("");
		for(int i=0;i<=Sarr.length-1;i++)
		{
			count++;
		}
			System.out.println("No of Words are  "+count);
	}
}
