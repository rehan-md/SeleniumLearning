package MavenBasic.MavenBasic;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleWindows {
	public static void main(String[] args) throws InterruptedException {
	

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String> windowIDs=driver.getWindowHandles();
		Iterator<String> it =windowIDs.iterator();
		String parentWindowId= it.next();
	    String childWindowId= it.next();
        System.out.println(driver.getTitle());
	    driver.switchTo().window(childWindowId);
        System.out.println(driver.getTitle());
	    driver.switchTo().window(parentWindowId);
        System.out.println(driver.getTitle());
        driver.close();


//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.google.com/");
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.bingle.com.au/");

	}

}
