package string_programs;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		String s1="html";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char ch=s1.charAt(i);
			s2=s2+ch;
		}
			System.out.println("Orginal String data :"+s1);
			System.out.println("Reverse String data :"+s2);
	}
}