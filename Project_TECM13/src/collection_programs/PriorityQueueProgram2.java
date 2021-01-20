package collection_programs;

import java.util.PriorityQueue;

public class PriorityQueueProgram2 
{
	public static void main(String[] args) 
	{
		PriorityQueue PQ2=new PriorityQueue();
		PQ2.add(56);
		PQ2.add(22);
		PQ2.add(33);
		PQ2.add(44);
		PQ2.add(55);
		for(int i=0;i<=PQ2.size()-1;i++)
		{
			System.out.println(PQ2.get(i));
		}
	}
}
