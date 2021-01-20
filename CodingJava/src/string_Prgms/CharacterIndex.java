
/*
 * Write a program to print index no of every character?
 */





package string_Prgms;

public class CharacterIndex 
{
		public static void main(String[] args)
		{
			String s1="Manjusri";
			for (int i=0;i<=s1.length()-1;i++)
			{
				char ch2=s1.charAt(i);
				int index=s1.indexOf(ch2);
				if(index==-1)
				{
					System.out.println("Given Character '"+ch2+"'is not found");
				}
				else
				{
					System.out.println("Given Character '"+ch2+"'is present at index number "+index);
				}
			}
			
		}
		
}
