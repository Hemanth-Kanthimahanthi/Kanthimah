package basic_prgms;

public class Circle 
{
	int r;
	final  double pie=3.14;
	
	public Circle(int r)
	{
		
		this.r=r;
	}
	
	public double findArea()
	{
		
		double area=pie*this.r*this.r;
		return area;
	}
}
