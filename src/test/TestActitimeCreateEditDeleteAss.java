package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.ActitimeEditTypeOfWorkPage;
import pages.ActitimeLogInPage;
import pages.ActitimeTypesOfWorkPage;

public class TestActitimeCreateEditDeleteAss {

	@Test
	
public void customer() throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","./drivers2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		ActitimeLogInPage login = new ActitimeLogInPage(driver);
		login.loginMethod();
		
		ActitimeTypesOfWorkPage settings = new ActitimeTypesOfWorkPage(driver);
		Thread.sleep(5000);
		settings.settingslinkMethod();
		
		ActitimeTypesOfWorkPage type = new ActitimeTypesOfWorkPage(driver);
		Thread.sleep(2000);
		type.typesofworkLinkMethod();
		
		ActitimeEditTypeOfWorkPage workname = new ActitimeEditTypeOfWorkPage(driver);
		Thread.sleep(2000);
		workname.typeofworknameLinkMethod();
		
		ActitimeEditTypeOfWorkPage edit = new ActitimeEditTypeOfWorkPage(driver);
		Thread.sleep(2000);
		edit.edittypeofworkTextfieldMethod();
		
		/*ActitimeTypesOfWorkPage create = new ActitimeTypesOfWorkPage(driver);
		Thread.sleep(3000);
		create.createtypeofworkLinkMethod();
		
		ActitimeTypesOfWorkPage name = new ActitimeTypesOfWorkPage(driver);
		Thread.sleep(5000);
		name.employeenameTextfieldMethod();*/
		
		ActitimeTypesOfWorkPage submit = new ActitimeTypesOfWorkPage(driver);
		submit.submitbuttonLinkMethod();

			
	}

}
