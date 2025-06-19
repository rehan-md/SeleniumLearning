package testNGbasic;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testNGAssertions {
	
	SoftAssert sa;
	
	@Test
	public void method1() {
	sa =new SoftAssert();
	System.out.println("Testing Assertion Start");
//	Assert.assertEquals(1, 1);
	sa.assertEquals(1, 2);
	System.out.println("Testing Assertion End");
    sa.assertAll();
		
	}

}
