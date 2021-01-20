package collection_programs;

import java.util.Vector;

public class VectorProgram1
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		v1.add(64);
		v1.add(2.5);
		v1.add("Jersey");
		v1.add('K');
		v1.add(false);
		System.out.println(v1);
	}
}
