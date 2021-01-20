package collection_programs;

import java.util.Iterator;
import java.util.Vector;

public class VectorProgram3 
{
	public static void main(String[] args) 
	{
		Vector v3=new Vector();
		v3.add(5.6);
		v3.add(2.2);
		v3.add(3.3);
		v3.add(4.4);
		v3.add(5.5);
		Iterator i1=v3.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
