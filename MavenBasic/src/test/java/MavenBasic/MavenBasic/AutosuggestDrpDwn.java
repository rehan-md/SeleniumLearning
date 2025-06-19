package MavenBasic.MavenBasic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDrpDwn {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		WebElement searchBox= driver.findElement(By.className("sb_form_q"));
		searchBox.sendKeys("Selenium");
		
		List<WebElement> result=driver.findElements(By.xpath("//li[contains(@class,'sa_sg')]//span"));
		System.out.println(result.size());
		for(WebElement ele : result) {
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("selenium automation")) {
				ele.click();
				break;
			}
		}
		
	}

}
