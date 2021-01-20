package purposful_execution;

import java.util.Scanner;

public class StringConversion_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Data : ");
		String s1=sc.next();
		char[] ch=new char[s1.length()];
		for(int i=0;i<=s1.length()-1;i++)
		{
			ch[i]=s1.charAt(i);
		}
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println(ch[i]);
		}
	}

}
