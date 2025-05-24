package MavenBasic.MavenBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class driverLaunch {
	
	@Test
	public void openBrowser() {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.aami.com.au/");
		driver.manage().window().maximize();
		driver.quit();
	}

}
