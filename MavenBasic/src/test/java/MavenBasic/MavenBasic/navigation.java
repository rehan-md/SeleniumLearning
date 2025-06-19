package MavenBasic.MavenBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class navigation {
	
	public static void main(String[] args) {
		RemoteWebDriver driver = new EdgeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	
		
	}

}
