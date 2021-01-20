package collection_programs;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueProgram3 
{
	public static void main(String[] args) 
	{
		PriorityQueue PQ3=new PriorityQueue();
		PQ3.add(5.6);
		PQ3.add(2.2);
		PQ3.add(3.3);
		PQ3.add(4.4);
		PQ3.add(5.5);
		Iterator i1=PQ3.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
