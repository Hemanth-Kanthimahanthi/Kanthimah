package store;

import receive.Demo2;

public class Demo3 extends Demo2
{
		public static void main(String[] args) 
		{
			int l=6,b=2;
			Demo3 d3=new Demo3();
			System.out.println("Area of Rectangle is "+d3.findArea(l, b));
			System.out.println("Perimeter of Rectangle is "+d3.findPerimeter(l, b));
		}
}
