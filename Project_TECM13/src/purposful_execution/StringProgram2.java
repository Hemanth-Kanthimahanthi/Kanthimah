package purposful_execution;

import java.util.Scanner;

public class StringProgram2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1=sc.next();
		System.out.println("Enter the Character which is to be found : ");
		char ch1=sc.next().charAt(0);
		int status =0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch2=s1.charAt(i);
			if(ch1==s1.charAt(i))
			{
				System.out.println(i);
			}
		}
		
	}
}
