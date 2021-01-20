package receive;

public class Test3 implements Test1,Test2
{

	@Override
	public int findArea(int l,int b) 
	{
		return l*b;
	}

	@Override
	public int findPerimeter(int l,int b) 
	{
		return 2*(l+b);
	}

	@Override
	public double getArea(int b,int h) 
	{
		 return 0.5*b*h;
	}

	@Override
	public int getPerimeter(int s) 
	{
		return s+s+s;
	}
	
	public static void main(String[] args)
	{
		Test3 t3=new Test3();
		System.out.println("Area of Rectangle = "+t3.findArea(25, 6));
		System.out.println("Perimeter of Rectangle = "+t3.findPerimeter(25, 6));
		System.out.println("Area of Triangle = "+t3.getArea(2, 3));
		
		System.out.println("Perimeter of Triangle = "+t3.getPerimeter(8));
	}

}
