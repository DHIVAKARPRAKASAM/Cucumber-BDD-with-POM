package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
public TestBase() throws IOException {
		
		prop =new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\dhiva\\eclipse-workspace\\AmazonBDDwithPOM\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(ip);
	}

public static void Initialize() throws IOException {
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		 driver=new ChromeDriver();
	}

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TimeOut.pageLoad,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TimeOut.implicit,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
}
	


	
}
