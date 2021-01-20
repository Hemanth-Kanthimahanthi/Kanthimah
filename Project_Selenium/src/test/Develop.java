package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Develop 
{
	public String baseUrl = "https://www.edureka.co/";
    String driverPath = "C:\\\\Selenium\\\\chromedriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching Chrome browser"); 
      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Edureka";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      //driver.close();
  }
}
