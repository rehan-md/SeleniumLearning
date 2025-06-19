package MavenBasic.MavenBasic;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink {
	
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		int brokenLink=0;
		
		for(int i=0; i<links.size(); i++) {
		    String url = links.get(i).getAttribute("href");
		    if(url==null || url.isEmpty()) {
		    	System.out.println("URL is empty");
		    	continue;
		    }
		    URL link;
			try {
				link = new URL(url);
				 HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
				 httpconn.connect();
				 if(httpconn.getResponseCode()>=400) {
					 System.out.println(httpconn.getResponseCode() +" "+ url+ " : is a broken link");
					 brokenLink++;
				 }
				 else {
					 System.out.println(httpconn.getResponseCode() +" "+ url+ " : is a valid link");

				 }
				    
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		   
		    
		    
		}
		
		System.out.println("Number of Broken link: "+ brokenLink);
		
	}

}
