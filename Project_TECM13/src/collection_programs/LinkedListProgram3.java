package collection_programs;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram3 
{
	public static void main(String[] args) 
	{
		LinkedList LL3=new LinkedList();
		LL3.add(5.6);
		LL3.add(2.2);
		LL3.add(3.3);
		LL3.add(4.4);
		LL3.add(5.5);
		Iterator i1=LL3.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
