package testNGbasic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C1 extends testBase{
	
	
	
	@Test(priority=1, groups= {"Sanity"})
	public void tm1() {
		System.out.println("This is test method 1");
	}
	
	@Test(priority=3, groups= {"Sanity","Regression","Functional"})
	public void tm3() {
		System.out.println("This is test method 3");
	}
	
	@Test(priority=4, groups= {"Regression"})
	public void tm4() {
		System.out.println("This is test method 4");
	}
	
	
	@AfterTest
	public void at() {
		System.out.println("This is after test");
	}
	
	

	

}
