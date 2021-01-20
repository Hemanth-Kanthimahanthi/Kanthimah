package basic_prgms;

import java.lang.Math;

public class Psix 
{
	public int p6Method1(int e)
	{
		
		return e*e;
		
	}
	public int p6Method2(int e,int f)
	{
		
		return p6Method1(e)-(4*f);
		
	}
	public int p6Method3(int e,int f)
	{
		
		return (int) Math.sqrt(p6Method2(e,f));
		
	}
	public int p6Method4(int e,int f)
	{
		
		return p6Method3(e,f)-e;
		
	}
	public int p6Method5(int e,int f)
	{
		
		return p6Method4(e,f)/(2*f);
	}
}
