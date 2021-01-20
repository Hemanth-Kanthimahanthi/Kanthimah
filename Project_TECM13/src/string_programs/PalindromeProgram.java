package string_programs;

import java.util.Scanner;

public class PalindromeProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String data");
		String s1=sc.nextLine();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
			System.out.println(s2);
		if(s2.contains(s1))
		{
			System.out.println("Given String is Palindrome");
		}
		else
		{
			System.out.println("Given String is not Palindrome");
		}
	}
}
