package purposful_execution;

import java.util.Scanner;

public class StringProgram5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Data : ");
		String s1=sc.next();
		String s2="aeiou";
		int count =0;
		for(int i=0;i<=s2.length()-1;i++)
		{
			char ch2=s2.charAt(i);
			for(int j=0;j<=s1.length()-1;j++)
			{
				  char ch1=s1.charAt(j);
			      if(ch2==ch1)
			      {
			    	  count++;
			      }
		    }
			if(count>=0)
			{
				System.out.println(ch2 + " is present "+ count + " times");
			}
			count=0;
		}
    }
}
