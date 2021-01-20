package basic_prgms;

public class Pthree 
{
	public double p3Method1(double c,double d)
	{
		
		return c+d;
		
	}
	public double p3Method2(double c,double d)
	{
		
		return p3Method1(c,d)*p3Method1(c,d);
		
	}
	public double p3Method3(double c,double d)
	{
		
		return p3Method2(c,d)-(c*c);
		
	}
	public double p3Method4(double c,double d)
	{
		
		return p3Method3(c,d)-(d*d);
		
	}
	public double p3Method5(double c,double d)
	{
		
		return p3Method4(c,d)-(2*c*d);
		
		
	}
}
