package basic_prgms;

public class Pten 
{
	public double pTMethod1(double c,double d)
	{
		
		return c*10;
		
	}
	public double pTMethod2(double c,double d)
	{
		
		return pTMethod1(c,d)*(d*2);
		
	}
	public double pTMethod3(double c,double d)
	{
		
		return pTMethod1(c,d)/(pTMethod2(c,d)*8);
		
	}
	public double pTMethod4(double c,double d)
	{
		
		return pTMethod3(c,d)+(pTMethod2(c,d)*2);
		
	}
	public double pTMethod5(double c,double d)
	{
		
		return pTMethod4(c,d)-(pTMethod1(c,d)-35);
	}
}
