package h_preparation;

import java.util.Scanner;

public class Compare_2Strings 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String 1:");
		String s1=scan.nextLine();
		System.out.println("Enter String 2:");
		String s2=scan.nextLine();
		if(s1.equals(s2))
		{
			System.out.println("Strings are similar");
		}
		else
		{
			System.out.println("Strings are not similar");
		}
	}
}
