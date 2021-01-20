package store;

import receive.Develop;

public class Test extends Develop
{
	public static void main(String[] args) 
	{
		Test t1=new Test();
		System.out.println("Sum Value is "+t1.add(6.4, 3.6));
		System.out.println("Substraction Value is "+t1.sub(20, 10));
		System.out.println("Multiplication Value is "+t1.mul(15, 5));
		System.out.println("Division Value is "+t1.div(155, 5));
		double k=+t1.add(6.4, 3.6)+t1.sub(20, 10)+t1.mul(15, 5)+t1.div(155, 5);
		System.out.println("Total Value is "+k);
	}
	
}
