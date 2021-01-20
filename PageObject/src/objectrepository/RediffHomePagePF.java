package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RediffHomePagePF 
{
	WebDriver driver;
	//Create a constructor
	
	
	public RediffHomePagePF(WebDriver driver)
	{
		this.driver=driver;
	}

	//By search=By.id("query");
	//By submit=By.xpath("//input[@type='submit']");
	
	@FindBy(id="query")
	WebElement search;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	
	public WebElement search()
	{
		return search;
	}
	public WebElement submit()
	{
		return submit;
	}
	
	
}
