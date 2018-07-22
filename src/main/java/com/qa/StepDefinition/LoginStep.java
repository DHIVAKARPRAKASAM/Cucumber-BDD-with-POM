package com.qa.StepDefinition;

import java.io.IOException;

import org.junit.Assert;

import com.qa.pages.LoginPage;
import com.qa.pages.SignInPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends TestBase {
	LoginPage loginpage=new LoginPage();
	SignInPage signin;

	public LoginStep() throws IOException {
		super();
	
	}

	@Given("^User is already in login page$")
	public void user_is_already_in_login_page() throws IOException {
	TestBase.Initialize();	
		
	}

	@When("^title of login page is Amazon$")
	public void title_of_login_page_is_Amazon() {
		String title=loginpage.titleVerify();
		System.out.println(title);
		Assert.assertEquals("Amazon Sign In", title);
	}
	
	@Then("^user enters mobile$")
	public void user_enters_mobile() throws IOException {
		System.out.println(prop.getProperty("mobile"));
		signin=loginpage.Button(prop.getProperty("mobile"));

	}


	@Then("^user is on password page is displayed$")
	public void user_is_on_password_page_is_displayed() throws Throwable {
		String title=signin.VerifyTitle();	
		Assert.assertEquals("Amazon Sign In", title);
	}

	
	
}
