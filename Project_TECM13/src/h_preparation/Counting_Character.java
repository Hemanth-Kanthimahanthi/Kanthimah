package h_preparation;

import java.util.Scanner;

public class Counting_Character 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String Data :");
		String s1=scan.next();
		System.out.println("Enter the character which is to be found :");
		char ch1=scan.next().charAt(0);
		int count=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch2=s1.charAt(i);
			if(ch1==ch2)
			{
				count++;
			}
		}
			System.out.println(count);
	}
}
