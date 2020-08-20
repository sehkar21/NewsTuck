package com.qa.Testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.Base.BaseClass;
import com.qa.config.ReadConfig;
import com.qa.pages.Homepage;
import com.qa.pages.LoginPage;

public class NewsLinkTest extends BaseClass {

	// Getting the total number of links in the Homepage and clicking the first
	// newslink based on index value and getting the title of that newslink and
	// returning back to parent window
	@Test(priority = 4, enabled = true, alwaysRun = true)
	public void NewsLink() throws InterruptedException {
		Thread.sleep(5000);
		LoginPage login = new LoginPage(driver);
		ReadConfig config = new ReadConfig();
		login.username().sendKeys(config.username());
		login.password().sendKeys(config.password());
		login.Loginbtn().click();
		String title = driver.getTitle();
		System.out.println("The HomePage Title is: " + title);
		Assert.assertEquals(title, "Newstuck");
		
		Thread.sleep(5000);
		Homepage homepage = new Homepage(driver);
		List<WebElement> links = homepage.NewsLink();

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			String linktext = links.get(i).getText();
			System.out.println(linktext);
		}

		links.get(2).click();

		Thread.sleep(10000);

		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		String parent = it.next();
		System.out.println("Parent window id : " + parent);

		String child = it.next();
		System.out.println("child window id : " + child);

		driver.switchTo().window(child);
		System.out.println("child window title is : " + driver.getTitle());
		Thread.sleep(3000);
		driver.close();

		driver.switchTo().window(parent);
		System.out.println("parent window title is :  " + driver.getTitle());
	}

	@Test(priority = 5, enabled = true, alwaysRun = true)
	public void Defaultdate() {
		Homepage homepage = new Homepage(driver);
		String defaultdate = homepage.currentdate().getText();
		System.out.println(defaultdate);
		Assert.assertEquals("Today", defaultdate);

		homepage.currentdate().click();
		homepage.Last3days().click();
		String filtereddate = homepage.currentdate().getText();
		System.out.println(filtereddate);

	}

}
