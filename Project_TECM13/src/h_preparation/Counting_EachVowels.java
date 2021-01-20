package h_preparation;

import java.util.Scanner;

public class Counting_EachVowels 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String Data :");
		String s1=scan.next();
		int ac=0;
		int ec=0;
		int ic=0;
		int oc=0;
		int uc=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a')
			{
				ac++;
			}
			else if(ch=='e')
			{
				ec++;
			}
			else if(ch=='i')
			{
				ic++;
			}
			else if(ch=='o')
			{
				oc++;
			}
			else if(ch=='u')
			{
				uc++;
			}
		}
			System.out.println("'a' count is "+ac);
			System.out.println("'e' count is "+ec);
			System.out.println("'i' count is "+ic);
			System.out.println("'o' count is "+oc);
			System.out.println("'u' count is "+uc);
	}
}
