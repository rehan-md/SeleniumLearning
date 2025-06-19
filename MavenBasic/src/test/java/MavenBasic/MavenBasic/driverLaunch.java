package MavenBasic.MavenBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class driverLaunch {
	
	@Test
	public void openBrowser() {
				
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aami.com.au/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
     	driver.quit();
	}

}
