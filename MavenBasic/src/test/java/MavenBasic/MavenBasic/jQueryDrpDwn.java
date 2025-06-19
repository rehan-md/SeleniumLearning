package MavenBasic.MavenBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jQueryDrpDwn {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.xpath("//*[@id='justAnInputBox']")).click();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
//		selectChoice(checkbox, "choice 2");
		selectChoice(checkbox, "choice 2", "choice 7", "choice 2 2", "choice 6 2 1");
//		selectChoice(checkbox, "all");

//		driver.quit();
		
		
		
	}
	
	public static void selectChoice(List<WebElement> ele,String... value) {
		try {
		System.out.println(ele.size());
        if(!value[0].equalsIgnoreCase("all")) {
        	for(WebElement option : ele) {
        		String text= option.getText();
        		for(String val: value) {
                if(text.equals(val)) {
                	 option.click();
                }
        		}
    		}
			
		}
        else {
        	for(WebElement option : ele) {
        		String text= option.getText();
                	 option.click();
                }
        		
    		}
        	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
