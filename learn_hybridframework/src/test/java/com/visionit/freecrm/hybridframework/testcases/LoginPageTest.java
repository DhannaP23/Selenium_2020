package com.visionit.freecrm.hybridframework.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.visionit.freecrm.hybridframework.pages.LoginPage;
import com.visionit.freecrm.hybridframework.testbase.TestBase;

public class LoginPageTest  extends TestBase{
	
	LoginPage login;
	
	@BeforeMethod
	public void setUp() {
		
		login = new LoginPage(driver);
	
	}
	
	@Test
	public void verifyLoginTest() {
		
		login.verifyLogin();
		
	}

}
