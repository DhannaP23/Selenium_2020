package com.visionit.freecrm.hybridframework.utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

    public class BrowserFactory {

		public static WebDriver driver;
		
		public static WebDriver browserSetUp(String bname, String url) {
			
			if (bname.equals("firefox")) {
		
				driver = new FirefoxDriver();
				
			} else if (bname.equals("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver.exe");
				
				driver = new ChromeDriver();
				
			} else if (bname.equals("ie")) {
				
				System.setProperty("webdriver.ie.driver", ".//Drivers//IEDriverServer.exe");
				
				driver = new InternetExplorerDriver();
				
			}
			
			else {
				System.out.println("browser name is not matching");
			}
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get(url);
			
			return driver;
			
		}
		
}
