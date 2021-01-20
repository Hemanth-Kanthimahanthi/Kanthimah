package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class LogInApplication 
{
	@Test
	public void login()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com");
		RediffLoginPage rd=new RediffLoginPage(driver);
		rd.emailId().sendKeys("hemu1806");
		rd.password().sendKeys("104emnt8");
		rd.signIn().click();
		RediffHomePage rh=new RediffHomePage(driver);
		rh.search().sendKeys("rediff");
		rh.submit().click();

	}
	
}
