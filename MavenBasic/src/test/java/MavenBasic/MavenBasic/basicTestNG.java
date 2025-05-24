package MavenBasic.MavenBasic;

import org.testng.annotations.Test;

public class basicTestNG {
	
	@Test(priority=1)
	public void openapp() {
		System.out.println("Open App");
	}
	
	@Test(priority=2)
	public void logout() {
		System.out.println("Logout");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Login");
	}

}
