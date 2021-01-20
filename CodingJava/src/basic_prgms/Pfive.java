package basic_prgms;

public class Pfive 
{
	public double p5Method1(double c,double d)
	{
		
		return c+d;
		
	}
	public double p5Method2(double c,double d)
	{
		
		return p5Method1(c,d)-(2*d);
		
	}
	public double p5Method3(double c,double d)
	{
		
		return p5Method1(c,d)*p5Method2(c,d);
		
	}
	public double p5Method4(double c,double d)
	{
		
		return p5Method3(c,d)-(c*c);
		
	}
	public double p5Method5(double c,double d)
	{
		
		return p5Method4(c,d)+(d*d);
	}
}
