package basic_prgms;

public class Pnine 
{
	public double p9Method1(double c,double d)
	{
		
		return c+d+25;
		
	}
	public double p9Method2(double c,double d)
	{
		
		return p9Method1(c,d)*25;
		
	}
	public double p9Method3(double c,double d)
	{
		
		return p9Method1(c,d)/p9Method2(c,d);
		
	}
	public double p9Method4(double c,double d)
	{
		
		return p9Method3(c,d)+p9Method3(c,d);
		
	}
	public double p9Method5(double c,double d)
	{
		
		return p9Method4(c,d)+p9Method1(c,d);
	}
}
