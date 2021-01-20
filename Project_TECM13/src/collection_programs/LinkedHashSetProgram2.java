package collection_programs;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram2 
{
	public static void main(String[] args) 
	{
		LinkedHashSet LHS2=new LinkedHashSet();
		LHS2.add(56);
		LHS2.add(22);
		LHS2.add(33);
		LHS2.add(44);
		LHS2.add(55);
		for(int i=0;i<=LHS2.size()-1;i++)
		{
			System.out.println(LHS2.get(i));
		}
	}
}
