package MavenBasic.MavenBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statusOfWebElement {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Display Status: "+ search.isDisplayed());
		System.out.println("Enable Status: "+ search.isEnabled());
		WebElement btnRadioMale= driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement btnRadioFemale= driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(btnRadioMale.isSelected());
		System.out.println(btnRadioFemale.isSelected());
		btnRadioMale.click();
		System.out.println(btnRadioMale.isSelected());
		System.out.println(btnRadioFemale.isSelected());
		btnRadioFemale.click();
		System.out.println(btnRadioMale.isSelected());
		System.out.println(btnRadioFemale.isSelected());
		driver.quit();
		



		
		
	}

}
