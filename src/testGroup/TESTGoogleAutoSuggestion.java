package testGroup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.GoogleAutoSuggestionPage;

public class TESTGoogleAutoSuggestion {

	@Test (groups="Regression")
	
	public void autosugg() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./drivers2/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		GoogleAutoSuggestionPage suggestions = new GoogleAutoSuggestionPage(driver);
		suggestions.searchMethod();
		
		
	}

}
