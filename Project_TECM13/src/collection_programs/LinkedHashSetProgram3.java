package collection_programs;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetProgram3 
{
	public static void main(String[] args) 
	{
		LinkedHashSet LHS3=new LinkedHashSet();
		LHS3.add(5.6);
		LHS3.add(2.2);
		LHS3.add(3.3);
		LHS3.add(4.4);
		LHS3.add(5.5);
		Iterator i1=LHS3.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
