package com.tns.prueba.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public final class DriverUtil {
	
	private static WebDriver webDriver;
	
	public static WebDriver getDriver() {
		
		if (webDriver == null) {

			System.setProperty("webdriver.chrome.driver", "/home/juanfernando/eclipse-workspace/Automatizacion/chromedriver_linux64/chromedriver");
			
			ChromeOptions options = new ChromeOptions();
		    options.addArguments("disable-infobars");
		    options.addArguments("--start-maximized");
		    options.addArguments("--disable-extensions");
		    options.addArguments("--disable-gpu"); 
		    options.addArguments("--disable-dev-shm-usage"); 
		    options.addArguments("--no-sandbox"); 
		        
			webDriver = new ChromeDriver(options);
			webDriver.manage().window().maximize();
			webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		
		return webDriver;
		
	}

}
