package java2021;

import java.util.Scanner;

public class Test2 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String data");
		String s1=sc.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		if(s2.contains(s1))
		{
			System.out.println("Given "+s1+" is a palindrome");
		}
		else
		{
			System.out.println("Given "+s1+" is not a palindrome");
		}
		
	}
}
