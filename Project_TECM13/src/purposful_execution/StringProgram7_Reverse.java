package purposful_execution;

import java.util.Scanner;

public class StringProgram7_Reverse 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Data : ");
		String s1=sc.next();
		String s2=" ";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
		  System.out.println(s1);
		  System.out.println(s2);
	}
}
