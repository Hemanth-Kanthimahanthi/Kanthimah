package purposful_execution;

import java.util.Scanner;

public class Compare_2Strings 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1=sc.next();
		System.out.println("Enter String 2 : ");
		String s2=sc.next();
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Strings are Similar");
		}
		else
		{
			System.out.println("Strings are not similar");
		}
	}
}
