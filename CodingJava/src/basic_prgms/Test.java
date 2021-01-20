package basic_prgms;

public class Test 
{
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
		System.out.println("Result is "+e);
		return e;
	}
    
	public static void main(String[] args) 
	{	
		Test t1=new Test();
		t1.bonus(10,20);	
	}
}
