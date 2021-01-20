package purposful_execution;

import java.util.Scanner;

public class Assignment1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String  : ");
		String s1=sc.next();
		System.out.println("Enter the Character which is to be found : ");
		char ch1=sc.next().charAt(0);
		int index=s1.indexOf(ch1);
		if(index==-1)
		{
			System.out.println("Given Character '"+ch1+ "' is not present...");
		}
		else
		{
			System.out.println("Given Character '"+ch1+ "' is present @ index number "+index);
		}
	}
}
