package collection_programs;

import java.util.Vector;

public class VectorProgram2 
{
	public static void main(String[] args) 
	{
		Vector v2=new Vector();
		v2.add(56);
		v2.add(22);
		v2.add(33);
		v2.add(44);
		v2.add(55);
		for(int i=0;i<=v2.size()-1;i++)
		{
			System.out.println(v2.get(i));
		}
	}
}
