package com.qa.Testcases;


import org.testng.annotations.Test;

import com.qa.Base.BaseClass;
import com.qa.config.ReadConfig;
import com.qa.pages.LoginPage;

public class EditorLoginTest extends BaseClass{

	@Test(priority=7,enabled=true, alwaysRun = true)
	public void loginTest() throws InterruptedException {
		
		Thread.sleep(5000);
		LoginPage	login = new LoginPage(driver);
		ReadConfig	config= new ReadConfig();
		login.username().sendKeys(config.Editorusername());
		login.password().sendKeys(config.Editorpassword());
		login.Loginbtn().click();
	}
		
		
}
