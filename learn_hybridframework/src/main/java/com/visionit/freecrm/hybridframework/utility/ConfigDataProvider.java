package com.visionit.freecrm.hybridframework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties prop;
	
	public ConfigDataProvider() {
		
		try {
			FileInputStream fins = new FileInputStream(
					new File(".//config//config.properties"));
			
			prop = new Properties();
			
			prop.load(fins);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public String getBrowser(String browserName) {
		
		return prop.getProperty(browserName);
		
	}
	
	public String getUrl(String urlName) {
		return prop.getProperty(urlName);
		
	}
	
	public String getKey(String keyName) {
		return prop.getProperty(keyName);
	
	}

}
