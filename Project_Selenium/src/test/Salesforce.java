package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("hemu14260");
		driver.findElement(By.name("pw")).sendKeys("LoveU");
		//driver.findElement(By.className("button r4 wide primary")).click();
		//<input class="button r4 wide primary" type="submit" id="Login" name="Login" value="Log In">
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();;
	}

}
