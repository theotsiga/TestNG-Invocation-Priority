package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.ActitimeHomePage;
import pages.ActitimeLogInPage;

public class TESTActitime {
	
	@Test   
	
	public void logrep() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","./drivers2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		ActitimeLogInPage login = new ActitimeLogInPage(driver);
		login.loginMethod();
		
		ActitimeHomePage home = new ActitimeHomePage(driver);
		Thread.sleep(2000);
		home.calendersMethod();
		//home.taskMethod();
		//home.timetrackMethod();		
		home.reportsMethod();
	}
}
