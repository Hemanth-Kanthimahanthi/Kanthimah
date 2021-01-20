
/*
 * Write a program to check whether given character available in a string  and
 *  if the String is found print its index number?
 */


package programs_string;

import java.util.Scanner;

public class Character_Available2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String Data :");
		String s1=scan.next();
		System.out.println("Enter the Character which is to be found : ");
		char ch=scan.next().charAt(0);
		int index=s1.indexOf(ch);
		if(index==-1)
		{
			System.out.println("Given Character '"+ch+"'is not found");
		}
		else
		{
			System.out.println("Given Character '"+ch+"'is present @ index number"+index);
		}
		
	}
}
