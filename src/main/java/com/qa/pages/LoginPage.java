package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath= "//input[@placeholder='User ID']")  
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath= "//input[@placeholder='Password']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath= "//input[@class='btn btn-primary']")
	@CacheLookup
	WebElement Loginbtn;
	
	@FindBy(xpath= "//h2[@class='login-header']")
	@CacheLookup
	WebElement LoginPageTitle;
	
	public WebElement username() {
		return username;
	}
	
	public WebElement password() {
		return password;
	}
	
	public WebElement Loginbtn() {
		return Loginbtn;
	}
	
	public WebElement LoginPageTitle() {
		return LoginPageTitle;
	}
	
	
}
