package com.pfm.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(id="user-name")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement login;
	
	public LoginPage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}

	public void enterusername(String name) {
		username.sendKeys(name);
	}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	public void clickonlogin() {
		login.click();
	}
}
