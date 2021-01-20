package useful_programs;

import java.util.Scanner;

public class Characters_Repeating 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String Data: ");
		String s1=scanner.nextLine();
		int status=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch1=s1.charAt(i);
			for(int j=0;j<=s1.length()-1;j++)
			{
				char ch2=s1.charAt(j);
				if(ch2==ch1 && i!=j)
				{
					status++;
					break;
				}
			}	
		}
		if(status>1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
	}
}
