package collection_programs;

import java.util.TreeSet;

public class TreeSetProgram2 
{
	public static void main(String[] args)
	{
		TreeSet TS2=new TreeSet();
		TS2.add(56);
		TS2.add(22);
		TS2.add(33);
		TS2.add(44);
		TS2.add(55);
		for(int i=0;i<=TS2.size()-1;i++)
		{
			System.out.println(TS2.get(i));
		}
	}
	
}
