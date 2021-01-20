package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage 
{
	WebDriver driver;
	//Create a constructor
	
	
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	By search=By.id("query");
	By submit=By.xpath("//input[@type='submit']");
	
	public WebElement search()
	{
		return driver.findElement(search);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
}
