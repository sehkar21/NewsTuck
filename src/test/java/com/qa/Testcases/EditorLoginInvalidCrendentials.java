package com.qa.Testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Base.BaseClass;
import com.qa.pages.LoginPage;

public class EditorLoginInvalidCrendentials extends BaseClass {

			//check login with invalid credentials
			@Test(priority=8, dataProvider = "getLoginInvaliData", enabled=true)
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
									{"stageEditor", "$tageN3w5tuckCu6ato613"}, 
									{"stageEditor123", "$tageN3w5tuck3d1to6"}, 
									{"stageEr123", "$tageN3w5tuckCu6ato613"},
									{"",""}
								  };
				
				return data;
			}
		
	
}
