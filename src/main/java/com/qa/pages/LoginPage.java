package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;



public class LoginPage extends TestBase {
	
	@FindBy(id="ap_email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement btn;
	
	@FindBy(name="email")
	WebElement email;

	public LoginPage() throws IOException {
		PageFactory.initElements(driver,this);
	}
	
	public String titleVerify() {
		return driver.getTitle();
	}
	
	public SignInPage Button(String un) throws IOException {
		username.sendKeys(un);
		btn.click();
		return new SignInPage();
	}
	
	
	
	
}
