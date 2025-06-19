package testNGbasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class testBase {
	

	@BeforeClass(groups= {"Sanity"})
	public void launchBrowser() {
		System.out.println("Launch browser");
	}

	@AfterClass(groups= {"Sanity"})
	public void quitBrowser() {
		System.out.println("quit browser");
	}
}
