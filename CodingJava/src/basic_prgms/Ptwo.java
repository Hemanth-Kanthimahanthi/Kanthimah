package basic_prgms;

public class Ptwo 
{
	public int p2Method1(int a,int b)
	{
		
		return a-b;
		
	}
	public int p2Method2(int a,int b)
	{
		
		return p2Method1(a,b)*4;
		
	}
	public int p2Method3(int a,int b)
	{
		
		return p2Method2(a,b)*5;
		
	}
	public int p2Method4(int a,int b)
	{
		
		return p2Method3(a,b)/10;
		
	}
	public int p2Method5(int a,int b)
	{
		
		return p2Method4(a,b)/2;
		
	}
}
