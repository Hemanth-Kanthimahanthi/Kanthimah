package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Selenium\\geckodriver.exe");
		WebDriver Fd=new FirefoxDriver();
		Fd.get("https://www.google.com/");
		System.out.println(Fd.getTitle());
	}
}
