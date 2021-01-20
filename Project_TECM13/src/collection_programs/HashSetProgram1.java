package collection_programs;

import java.util.HashSet;

public class HashSetProgram1 
{
	public static void main(String[] args) 
	{
		HashSet HS1=new HashSet();
		HS1.add(64);
		HS1.add(2.5);
		HS1.add("Jersey");
		HS1.add('K');
		HS1.add(false);
		System.out.println(HS1);
	}
}
