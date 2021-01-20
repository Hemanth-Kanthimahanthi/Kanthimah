package store;

import basic_prgms.*;
import receive.Rectangle;

public class Draw extends Dimensions
{
	public  double totalArea()
	{
		double TA=super.c1.findArea()+super.r1.getArea();
		return TA;
	}

	public static void main(String[] args) 
	{
		c1=new Circle(5);
		r1=new Rectangle(9, 8);
		/*System.out.println("Area of Circle is "+c1.findArea());
		System.out.println("Area of Rectangle is "+r1.getArea());*/
		Draw d1= new Draw();
        System.out.println("Total Area is "+d1.totalArea());
	}

}
