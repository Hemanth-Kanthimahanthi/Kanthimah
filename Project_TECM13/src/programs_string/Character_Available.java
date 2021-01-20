
/*
 * Write a program to check whether given character available in a string?
 * 
 */



package programs_string;

import java.util.Scanner;

public class Character_Available 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String Data :");
		String s1=scan.next();
		System.out.println("Enter the Character which is to be found : ");
		char ch1=scan.next().charAt(0);
		int status=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch2=s1.charAt(i);
			if(ch1==ch2)
			{
				status=1;
				break;	
			}
		}
		if(status==0)
		{
			System.out.println("Character is not found");
		}
		else
		{
			System.out.println("Character is not found");
		}
	}
}
