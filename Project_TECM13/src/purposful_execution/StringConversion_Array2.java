package purposful_execution;

import java.util.Scanner;

public class StringConversion_Array2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Data : ");
		String s1=sc.next();
		char[] ch=s1.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]);
		}
	}
}
