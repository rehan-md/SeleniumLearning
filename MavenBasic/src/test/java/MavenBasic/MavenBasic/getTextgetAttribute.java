package MavenBasic.MavenBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextgetAttribute {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement txtAdminEmail = driver.findElement(By.xpath("//div[@style='text-align:center;']//p[1]"));
    	System.out.println(txtAdminEmail.getText());
		WebElement txtBoxEmail = driver.findElement(By.xpath("//input[@name='Email']"));
//		System.out.println(txtBoxEmail.getAttribute("value"));
//		txtBoxEmail.clear();
//		txtBoxEmail.sendKeys("test@gmail.com");
//		System.out.println(txtBoxEmail.getAttribute("value"));

//		driver.get("https://the-internet.herokuapp.com/challenging_dom");
//		WebElement btnSuccess=driver.findElement(By.xpath("//a[@class='button success']"));
//		System.out.println(btnSuccess.getText());
//		List<WebElement> table = driver.findElements(By.xpath("//tbody/tr/td"));
//
//		for(int i=0; i<table.size();i++) {
//			if(table.get(i).getText().contains("edit")){
//		    List<WebElement> tableLink = driver.findElements(By.xpath("(//tbody/tr/td)["+(i+1)+"]/a"));
//					System.out.println(tableLink.size());
//					for(WebElement ele : tableLink ) {
//						System.out.println(ele.getText());
//					}
//
//			}
//			else {
//			System.out.println(table.get(i).getText());
//			}
//			
//		}
		driver.quit();
		
	}

}
