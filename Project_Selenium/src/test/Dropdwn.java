package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn 
{
	public static void main(String[] args) 
	{
				
		 // System Property for Chrome Driver   
        System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");  
  
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver();  
  
        // Launch Website  
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
  
  
        //Using Select class for selecting value from dropdown  
      
        Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
        dropdown.selectByVisibleText("Manual Testing");  
  
        // Close the Browser  
        //driver.close();  
		
	}
}
