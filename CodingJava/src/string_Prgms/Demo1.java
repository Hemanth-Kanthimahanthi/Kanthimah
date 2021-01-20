/*
 * Write a program to check whether given character available in string or not?
 */



package string_Prgms;

public class Demo1 
{
	public static void main(String[] args) 
	{
		String s1="Mahendra";
		char ch1='t';
		int status=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch2=s1.charAt(i);
			if(ch1==ch2)
			{
				status=1;
				break;
			}
		}
		if(status==0)
		{
			System.out.println("Character is not found");
		}
		else
		{
			System.out.println("Character is found");
		}
	}
}
	
