package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {
	
	public static void main(String[] args) {
		System.out.println("Launch Webrowser");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.aami.com.au/");
		driver.manage().window().maximize();
		driver.quit();
	}

}