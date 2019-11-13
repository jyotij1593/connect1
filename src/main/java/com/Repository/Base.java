package com.Repository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static Base instance=null;	
	private WebDriver driver;
	private Base() {
		
	}
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jyotij\\Connect\\MavConnect\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static  Base getInstances() {
		
		if(instance==null)
		{
			instance=new Base();
			
		}
		return instance;
		
	}
	
}
