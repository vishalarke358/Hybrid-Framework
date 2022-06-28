package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	public static WebDriver driver;
	public static configDataProvider config;
	public static excelDataProvider excel;
	
	@BeforeSuite
	public void initilizationSetUp() throws Exception {
	config=new configDataProvider();
	excel=new excelDataProvider();
	}
	
	
	@SuppressWarnings("deprecation")
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setup(String BrowserName) throws InterruptedException {
		
		if(BrowserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();	
		}
		
		 else if(BrowserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
	}
		
//		driver.get("https://www.facebook.com/login/"); 

		driver.getCurrentUrl();
		driver.get(config.getQAENV_1());    ////use of config data provider,we get URL from config properties file 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
