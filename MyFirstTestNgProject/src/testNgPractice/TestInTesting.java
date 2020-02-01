package testNgPractice;

import org.testng.annotations.Test;

public class TestInTesting {
	
	@Test
	public void registerNewAppTest() {
		
		System.out.println("registerNewAppTest");
	}
	@Test
	public void loginToAppTest() {
		
		System.out.println("loginToNewAppTest");
	}
	@Test
	public void createAnAppTest() {
		
		System.out.println("createAnAppTest()");
	}
	@Test
	public void logoutToAppTest() {
		
		System.out.println("logoutToAppTest()");
	}
	
}
