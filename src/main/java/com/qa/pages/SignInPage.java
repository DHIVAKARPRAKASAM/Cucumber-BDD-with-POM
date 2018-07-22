package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SignInPage {
	WebDriver driver;
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement passwrdBtn;
	
	public SignInPage() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public String VerifyTitle() {
		return driver.getTitle();
	}
	
	public HomePage passwordClick(String pass) throws IOException {
		password.sendKeys(pass);
		passwrdBtn.click();
		return new HomePage();
	}
}
