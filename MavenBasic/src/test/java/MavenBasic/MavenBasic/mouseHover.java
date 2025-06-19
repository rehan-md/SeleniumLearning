package MavenBasic.MavenBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aami.com.au/");
		WebElement ele = driver.findElement(By.xpath("(//span[text()='Car & Vehicle'])[1]"));
		System.out.println(ele.getCssValue("color"));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		System.out.println(ele.getCssValue("color"));

		
		
	}

}
