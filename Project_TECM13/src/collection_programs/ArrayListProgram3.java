package collection_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram3 
{
	public static void main(String[] args) 
	{
		ArrayList AL3=new ArrayList();
		AL3.add(5.6);
		AL3.add(2.2);
		AL3.add(3.3);
		AL3.add(4.4);
		AL3.add(5.5);
		Iterator i1=AL3.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
