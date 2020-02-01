package testNgPractice;

import org.testng.annotations.Test;

public class DisabledTestInTesting {
	
	@Test(enabled=true)
	public void tc_001() {
		System.out.println("tc_001");
	}
	
	@Test
	public void tc_002() {
		System.out.println("tc_002");
	}
	
	@Test(enabled=false)
	public void tc_003() {
		System.out.println("tc_003");
	}
	@Test(enabled=true)
	public void tc_004() {
		System.out.println("tc_004");
	}

}
