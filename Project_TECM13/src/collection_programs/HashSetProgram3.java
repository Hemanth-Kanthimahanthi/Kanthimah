package collection_programs;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetProgram3 
{
	public static void main(String[] args) 
	{
		HashSet HS3=new HashSet();
		HS3.add(5.6);
		HS3.add(2.2);
		HS3.add(3.3);
		HS3.add(4.4);
		HS3.add(5.5);
		Iterator i1=HS3.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
