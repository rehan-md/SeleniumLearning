package MavenBasic.MavenBasic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public final class handleAlerts {
	

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			WebElement JSprompt= driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
			JSprompt.click();
			Alert alertwindow= driver.switchTo().alert();
			System.out.println(alertwindow.getText());
			Thread.sleep(Duration.ofSeconds(2));
			alertwindow.sendKeys("Test");
			alertwindow.accept();

			
		}
}
