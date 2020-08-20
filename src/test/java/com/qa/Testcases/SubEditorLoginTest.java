package com.qa.Testcases;






import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.Base.BaseClass;
import com.qa.config.ReadConfig;
import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;

public class SubEditorLoginTest extends BaseClass{

	
	//check login with valid username and valid password
	@Test(priority=1,enabled=true)
	public void loginTest() throws InterruptedException {
		
		Thread.sleep(5000);
		LoginPage	login = new LoginPage(driver);
		ReadConfig	config= new ReadConfig();
		login.username().sendKeys(config.username());
		login.password().sendKeys(config.password());
		login.Loginbtn().click();
		Thread.sleep(5000);
		
	}
	
	//check Title of HomePage
	@Test(priority=2,enabled=true)
	public void HomePageTitle() throws InterruptedException {
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("The HomePage Title is: "+ title);
		Assert.assertEquals(title, "Newstuckw");
		
		Homepage homepage = new Homepage(driver);
		List<WebElement> links = homepage.NewsLink();
		
		System.out.println(links.size());

	
	}
	

	
}
