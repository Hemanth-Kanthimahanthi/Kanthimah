package purposful_execution;

import java.util.Scanner;

public class StringProgram4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1=sc.next();
		int count =0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
		}
			System.out.println("The no of vowels present in a given string is "+count);
	}
}
  