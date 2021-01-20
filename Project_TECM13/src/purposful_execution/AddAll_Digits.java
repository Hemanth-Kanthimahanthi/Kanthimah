package purposful_execution;

import java.util.Scanner;

public class AddAll_Digits
{
	public static void main(String[] args) 
	{
		int sum=0,k=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String s1=sc.nextLine();
		for(int i=0;i<s1.length();i++) 
		{
			if(Character.isDigit(s1.charAt(i))) 
			{
				k=Character.getNumericValue(s1.charAt(i));
				//System.out.println(k);
				sum=sum+k;
			}
		}
		System.out.println(sum);
	}
}
