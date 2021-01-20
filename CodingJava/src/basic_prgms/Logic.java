package basic_prgms;

import java.util.Scanner;

public class Logic 
{
	public static void main(String[] arg)
	{
		int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	Logic l1=new Logic();
	l1.bonus(a,b);
	}

	public int add(int a, int b)
	{
		int c=a+b;
		System.out.println("Sum of two integers is "+c);
		return c;	
	}
	
	public int average(int a, int b)
	{
		int d;
		d=add(a,b)/2;
		System.out.println("Average of two integers is "+d);
		return d;	
	}
	public int bonus(int a,int b) 
	{
		int e;
		e= average(a,b)+20;
		System.out.println("Total is "+e);
		return e;
	}
}
