package testNgPractice;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependencyInTestNg {
	
	@Test
	public void loginTest() {
		System.out.println("loginTest()");
		Assert.assertTrue(true);
	}

	@Test(dependsOnMethods= {"loginTest"})
	public void updateAnAccountTest() {
		System.out.println("updateAnAccountTest()");
		Assert.assertTrue(false);
	}
	
	@Test
	public void logoutTest() {
		System.out.println("logoutTest()");
		Assert.assertTrue(true);
	}
	
}
