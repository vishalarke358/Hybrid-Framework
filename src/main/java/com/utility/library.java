package com.utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class library {

	public static ExtentTest test;
	
	
	
	//for value send
	public static void custom_sendkeys(WebElement element, String value, String fieldName) {
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldName+"=Value Sucesfully Send="+value);

		}
		catch(Exception e){
			test.log(Status.FAIL,e.getMessage());  //to show in index file
//			System.out.println(e.getMessage());
		}
	}	
	
	
	//for click	
	public static void custom_click(WebElement element, String fieldName) {
		try {
			element.click();
			test.log(Status.PASS,"Clicked Succesfully on=" +fieldName);
		}
		catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());   
//		System.out.println(e.getMessage());
		}
	}
	
	
}


