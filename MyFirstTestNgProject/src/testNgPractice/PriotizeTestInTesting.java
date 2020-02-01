package testNgPractice;

import org.testng.annotations.Test;

public class PriotizeTestInTesting {
	
	@Test(priority=1)
	public void registerNewAppTest() {
		
		System.out.println("registerNewAppTest()");
	}
	
	@Test(priority=2)
	public void loginToAppTest() {
		
		System.out.println("loginToAppTest()");
	}
	
	//TC which are not priority those TC will execute according to the alphabetical order
	//of the test then followed by priorities TC
	
	@Test
	public void createAnAccountTest() {
		
		System.out.println("createAnAccountTest()");
	}
	
	@Test(priority=3)
	public void logoutToAppTest() {
		
		System.out.println("logoutToAppTest()");
	}
	
}
