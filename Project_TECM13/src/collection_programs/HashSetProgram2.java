package collection_programs;

import java.util.HashSet;

public class HashSetProgram2 
{
	public static void main(String[] args) 
	{
		HashSet HS2=new HashSet();
		HS2.add(56);
		HS2.add(22);
		HS2.add(33);
		HS2.add(44);
		HS2.add(55);
		for(int i=0;i<=HS2.size()-1;i++)
		{
			System.out.println(HS2.get(i));
		}
	}
}
