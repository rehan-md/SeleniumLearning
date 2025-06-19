package MavenBasic.MavenBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementFindElements {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		List<WebElement> footers=driver.findElements(By.xpath("//div[@class='footer-upper']//ul[@class='list']/li/a"));
		System.out.println(driver.findElement(By.xpath("//div[@class='footer-upper']//ul[@class='list']/li/a")).getText());
		System.out.println(footers.size());
		for(WebElement footer: footers) {
			System.out.println(footer.getText());
		}
		driver.quit();
		
		
	}

}
