package collection_programs;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetProgram3 
{
	public static void main(String[] args) 
	{
		TreeSet TS3=new TreeSet();
		TS3.add(5.6);
		TS3.add(2.2);
		TS3.add(3.3);
		TS3.add(4.4);
		TS3.add(5.5);
		Iterator i1=TS3.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
