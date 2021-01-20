package run;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

@Test
public class Login1 
{
	public void afterClass()
	{
		System.out.println("After class all methods will execute");
	}
	public void webLoginHomeLoan()
	{
		System.out.println("WebLoginHomeloan");
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void afterEvery()
	{
		System.out.println("After I will execute after every method in Login1 class");
	}
	
	public void mobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeloan");

	}
	@AfterTest
	public void mobileSigninHomeLoan()
	{
		System.out.println("MobileSigninHomeloan");

	}
	public void mobileSignoutHomeLoan()
	{
		System.out.println("MobileSignoutHomeloan");

	}
	@AfterSuite
	public void bfSuite()
	{
		System.out.println("AF Suite I will execute last");
	}
	
	public void loginAPIHomeLoan()
	{
		System.out.println("LoginAPIHomeloan");

	}
	public void prereq()
	{
		System.out.println("PREREQ");
	}
}
