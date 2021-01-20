package collection_programs;

import java.util.LinkedHashSet;

public class LinkedHashSetProgram1 
{
	public static void main(String[] args) 
	{
		LinkedHashSet LHS1=new LinkedHashSet();
		LHS1.add(64);
		LHS1.add(2.5);
		LHS1.add("Jersey");
		LHS1.add('K');
		LHS1.add(false);
		System.out.println(LHS1);
	}
}
