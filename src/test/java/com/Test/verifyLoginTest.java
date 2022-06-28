package com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageObject.loginPom;
import com.utility.baseClass;
import com.utility.library;

public class verifyLoginTest extends baseClass {

	@Test
	public void verify_tc_01_loginWithValidCredentials() throws InterruptedException {

		loginPom login=PageFactory.initElements(driver,loginPom.class);
		
		//give direct Hard core data
//		login.getTxt_email().sendKeys("Vishalarke358@gmail.com");
//		login.getTxt_pass().sendKeys("Pass@123");;
//		login.getBtn_lgn().click();
		
		//Resolved Exception from library class
//		library.custom_sendkeys(login.getTxt_email(), "Vishalarke358@gmail.com");
//		library.custom_sendkeys(login.getTxt_pass(), "Pass@123");
//		library.custom_click(login.getBtn_lgn());
		
		
		//fetch data from excel
		library.custom_sendkeys(login.getTxt_email(), excel.getStringData("Sheet1", 0, 0), "txt_email");
		library.custom_sendkeys(login.getTxt_pass(), excel.getStringData("Sheet1", 0, 1), "txt_pass");
		library.custom_click(login.getBtn_lgn(), "btn_lgn");
		
		
	
		
	}

}
