package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffHomePagePF;
import objectrepository.RediffLoginPage;
import objectrepository.RediffLoginPagePF;

public class LogInApplicationPf 
{
	@Test
	public void login()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com");
		RediffLoginPagePF rd=new RediffLoginPagePF(driver);
		rd.emailId().sendKeys("hemu1806");
		rd.password().sendKeys("104emnt8");
		rd.signIn().click();
		RediffHomePagePF rh=new RediffHomePagePF(driver);
		rh.search().sendKeys("news");
		rh.submit().click();

	}
	
}
