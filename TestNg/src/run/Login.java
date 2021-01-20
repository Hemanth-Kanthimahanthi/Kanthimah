package run;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login
{
	//@Parameters({"URL","Fkey"})
	@Test
	public void WebLoginCarLoan()//String urlname,String fKey
	{
		//System.out.println(urlname);
		//System.out.println(fKey);
		System.out.println("I am helper");
	}
	
	@Test()
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarloan");

	}
	@BeforeMethod
	public void beforeEvery()
	{
		System.out.println("I will execute before every method in Login class");
	}
	
	@Test
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICarloan");

	}
			
	
}

