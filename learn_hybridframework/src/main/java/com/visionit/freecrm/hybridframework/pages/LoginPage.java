package com.visionit.freecrm.hybridframework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// object repository
	
	@FindBy(name="username")
	WebElement user;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;

    WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyLogin() {
		
		user.sendKeys("vasant@23");
		pass.sendKeys("vasant@321");
		loginBtn.click();
	}

}
