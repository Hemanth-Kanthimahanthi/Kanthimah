package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class Flipkart extends TestBase{
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//form[@autocomplete='on']/div[2]/input")).sendKeys("hello");
	}

}

