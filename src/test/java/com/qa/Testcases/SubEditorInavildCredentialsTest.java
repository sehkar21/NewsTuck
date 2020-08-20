package com.qa.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Base.BaseClass;
import com.qa.pages.LoginPage;

public class SubEditorInavildCredentialsTest extends BaseClass {

	
	//check login with invalid credentials
	@Test(priority=3, dataProvider = "getLoginInvaliData", enabled=true, alwaysRun = true)
	public void login_InvalidTestCases(String username, String pwd) throws InterruptedException {
		LoginPage	login = new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		login.username().sendKeys(username);
		login.password().sendKeys(pwd);
		Thread.sleep(5000);
		login.Loginbtn().click();
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	
	
	@DataProvider
	public Object[][] getLoginInvaliData(){
		Object data[][] = { 
							{"StageCurator", "$tageN3w5tuckCu6ato613"}, 
							{"StageCurator13", "$tageN3w5tuckCu6ato6"}, 
							{"St13ageCur", "$tageN3w5tuckCu6ato613"},
							{"",""}
						  };
		
		return data;
	}
	
	
}
