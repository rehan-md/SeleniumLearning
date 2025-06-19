package MavenBasic.MavenBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handleDropdown {
	
	public static void main(String[] args) {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		WebElement country= driver.findElement(By.name("Country"));
		Select drpDown =new Select(country);
		drpDown.selectByVisibleText("Brazil");
		drpDown.selectByValue("India");
		drpDown.selectByIndex(2);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//button[text()='Book a Free Demo']")).click();
		WebElement country1= driver.findElement(By.name("Country"));
		WebElement employee= driver.findElement(By.name("NoOfEmployees"));
		selectDrpDwn(country1, "Peru");
		selectDrpDwn(employee, "51 - 200");

	}
	
	public static void selectDrpDwn(WebElement dropDown, String value) {
		
		Select drp = new Select(dropDown);
	    List<WebElement> option=drp.getOptions();
	    for(WebElement ele : option) {
	    	if(ele.getText().equals(value)) {
	    		ele.click();
	    		break;
	    	}
	    }
	}

}
