package h_preparation;

import java.util.Scanner;

public class ReverseOrder 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String Data :");
		String s1=scan.nextLine();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			System.out.print(ch);
		}
		
	}
}
