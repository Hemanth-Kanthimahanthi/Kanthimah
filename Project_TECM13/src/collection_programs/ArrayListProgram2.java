package collection_programs;

import java.util.ArrayList;

public class ArrayListProgram2 
{
	public static void main(String[] args) 
	{
		ArrayList AL2=new ArrayList();
		AL2.add(56);
		AL2.add(22);
		AL2.add(33);
		AL2.add(44);
		AL2.add(55);
		for(int i=0;i<=AL2.size()-1;i++)
		{
			System.out.println(AL2.get(i));
		}
	}
}
