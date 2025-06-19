package testNGbasic;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C2  extends testBase {
	
	@Test(priority=2, groups= {"Sanity"})
	public void tm2() {
		System.out.println("This is test method 2");
	}

	@Test(priority=5, groups= {"Sanity","Regression","Functional"})
	public void tm5() {
		System.out.println("This is test method 5");
	}
	@Test(priority=6,  groups= {"Regression"})
	public void tm6() {
		System.out.println("This is test method 6");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("This is before test");
	}
	
}
