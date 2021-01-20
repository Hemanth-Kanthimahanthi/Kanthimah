package org.jsp.app;

public class MainClass 
{
	public static void main(String[] args)
	{
		
		//1st way
		new HelloWorld().msg();
		new HelloWorld().greet();
		new HelloWorld().service();
		
		System.out.println("====================================================");
		
		
		//2nd way 
		
		HelloWorld hw=new HelloWorld();
		hw.msg();
		hw.greet();
		hw.service();
		
		//3rd way
	}
}
