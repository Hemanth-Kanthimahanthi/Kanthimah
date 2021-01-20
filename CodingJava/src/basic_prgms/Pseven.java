package basic_prgms;

public class Pseven 
{
	public double p7Method1(double c,double d)
	{
		
		return 2*(c*d);
		
	}
	public double p7Method2(double c,double d)
	{
		
		return p7Method1(c,d)/(2*d);
		
	}
	public double p7Method3(double c,double d)
	{
		
		return p7Method1(c,d)*p7Method2(c,d);
		
	}
	public double p7Method4(double c,double d)
	{
		
		return p7Method3(c,d)-(c*c);
		
	}
	public double p7Method5(double c,double d)
	{
		
		return p7Method4(c,d)+(d*d);
	}
}
