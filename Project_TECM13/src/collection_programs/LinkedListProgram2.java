package collection_programs;

import java.util.LinkedList;

public class LinkedListProgram2 
{
	public static void main(String[] args) 
	{
		LinkedList LL2=new LinkedList();
		LL2.add(56);
		LL2.add(22);
		LL2.add(33);
		LL2.add(44);
		LL2.add(55);
		for(int i=0;i<=LL2.size()-1;i++)
		{
			System.out.println(LL2.get(i));
		}
	}
}
