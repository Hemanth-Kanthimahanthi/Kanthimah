package store;

public class Triangle extends Develop
{

	@Override
	public double findArea(int b,int h) 
	{
	
		return (0.5*b*h);
		
	}
	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();
		System.out.println("Area of Triangle is "+t1.findArea(15, 16));
		System.out.println("Perimeter is "+t1.findPerimeter(5, 10, 15));
	}

}
