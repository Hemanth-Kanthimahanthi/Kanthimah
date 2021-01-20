package test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookBrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("hemu1806@gmail.com");;
		driver.findElement(By.name("pass")).sendKeys("9542852435");;
		driver.findElement(By.linkText("Forgotten password?")).click();;
		
	
	}
}
