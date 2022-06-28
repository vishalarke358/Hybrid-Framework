package com.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPom {

	@FindBy(how=How.XPATH,using="//input[@id='email']")
	private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_pass;
	
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btn_lgn;
	
	

	public WebElement getTxt_email() {
		return txt_email;
	}

	public WebElement getTxt_pass() {
		return txt_pass;
	}



	public WebElement getBtn_lgn() {
		return btn_lgn;
	}





	









}
