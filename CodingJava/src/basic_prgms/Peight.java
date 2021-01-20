package basic_prgms;

public class Peight 
{
	public double p8Method1(double c,double d)
	{
		
		return c+d;
		
	}
	public double p8Method2(double c,double d)
	{
		
		return p8Method1(c,d)-c;
		
	}
	public double p8Method3(double c,double d)
	{
		
		return p8Method1(c,d)+100;
		
	}
	public double p8Method4(double c,double d)
	{
		
		return p8Method3(c,d)/(c*d);
		
	}
	public double p8Method5(double c,double d)
	{
		
		return p8Method4(c,d)+(d*d);
	}
}
