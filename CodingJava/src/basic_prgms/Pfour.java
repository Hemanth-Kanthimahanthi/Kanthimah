package basic_prgms;

public class Pfour 
{
	public int p4Method1(int e,int f)
	{
		
		return e-f;
		
	}
	public int p4Method2(int e,int f)
	{
		
		return p4Method1(e,f)*p4Method1(e,f);
		
	}
	public int p4Method3(int e,int f)
	{
		
		return p4Method2(e,f)-(e*e);
		
	}
	public int p4Method4(int e,int f)
	{
		
		return p4Method3(e,f)-(f*f);
		
	}
	public int p4Method5(int e,int f)
	{
		
		return p4Method4(e,f)+(2*e*f);
	}
}
