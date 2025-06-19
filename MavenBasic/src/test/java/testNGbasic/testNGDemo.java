package testNGbasic;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class testNGDemo  extends testBase {
	
	
	@Test(priority=1)
	public  void openApp() {
		System.out.println("Open App..");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3, dependsOnMethods= {"openApp","login"})
	public  void logout() {
		System.out.println("Log Out..");
	}
	
	@Test(priority=2,dependsOnMethods= {"openApp"})
	public  void login() {
		System.out.println("Log In..");
		Assert.assertTrue(true);

	}
	
	


}
