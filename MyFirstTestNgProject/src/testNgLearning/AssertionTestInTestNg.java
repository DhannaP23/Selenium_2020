package testNgLearning;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertionTestInTestNg {
	@Test
	public void tc_001() {
		Assert.assertTrue(false); //fail
	}
	
	@Test
	public void tc_002() {
		Assert.assertTrue(true); //pass
	}
	
	@Test
	public void tc_003() {
		Assert.assertTrue(true); //pass
	}
	
	@Test
	public void tc_004() {
		Assert.assertTrue(false); //fail
	}
	
	@Test
	public void tc_005() {
		Assert.assertNotEquals("DHANNA", "Dhanna"); //pass
	}
	
	@Test
	public void tc_006() {
		Assert.assertNotEquals("DHANNA","DHANNA"); //fail
	}
	
	@Test
	public void tc_007() {
		Assert.assertEquals("Dhanna","Dhanna");//pass
	}
	
	@Test
	public void tc_008() {
		Assert.assertEquals("Dhanna","dhanna");// fail
	}
	
}
