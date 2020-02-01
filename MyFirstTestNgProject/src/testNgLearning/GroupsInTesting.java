package testNgLearning;

import org.testng.annotations.Test;

public class GroupsInTesting {

	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("sanity");
	}
	
	@Test(groups= {"sanity","regression"})
	public void test2() {
		System.out.println("regression");
	}
	
	@Test(groups= {"regressiom"})
	public void test3() {
		System.out.println("regression");
	}
	
	@Test(groups= {"end to end","regression"})
	public void test4() {
		System.out.println("end to end");
		
	}
}
