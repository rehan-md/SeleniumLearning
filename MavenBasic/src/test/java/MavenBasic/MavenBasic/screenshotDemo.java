package MavenBasic.MavenBasic;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotDemo {
	
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
//		FullPage screenhot
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src=ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".\\screenshots\\homepage.png");
//		FileUtils.copyFile(src, trg);
		
		
//
		WebElement ele= driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File src=ele.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\logo.png");
		FileUtils.copyFile(src, trg);
		
		
		
	}
	
	
}
