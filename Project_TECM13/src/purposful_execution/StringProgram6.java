package purposful_execution;

import java.util.Scanner;

public class StringProgram6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1=sc.next();
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			System.out.print(ch);
		}
	}
}
