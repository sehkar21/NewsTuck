package com.qa.Testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import com.qa.pages.Homepage;


public class SendReviewTest extends NewsLinkTest {

	
	@Test(priority=6, enabled=true,alwaysRun = true)
	public void EditorReview() throws InterruptedException {
		
	
		Homepage homepage = new Homepage(driver);
		
		//Getting the Time of Publication of the latest news
//		String TimeOfPublication = homepage.TimeofPublication().getText();
//		System.out.println(TimeOfPublication);
		 
		// clicking the latest news and ranking them to send it to the editor for review
		List<WebElement> links = homepage.NewsLink();
		 Thread.sleep(4000);
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			String linktext = links.get(i).getText();
			System.out.println(linktext);
		}
		links.get(2).click();
		
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it= handler.iterator();
		
		String parent = it.next();
		driver.switchTo().window(parent);
		
		homepage.CompetencyRank().click();
		homepage.CompetencyRating().click();
		
		homepage.TrustWorthinessRank().click();
		homepage.TrustWorthinessRating().click();
		
		homepage.FactRank().click();
		homepage.FactRating().click();
		
		homepage.OpinionRank().click();
		homepage.OpinionRating().click();
		
		homepage.NewsCheckBox().click();
		homepage.EnableSliderbtn().click();
		
		homepage.EditorReviewBtn().click();
		homepage.BrowseAgain().click();
		
	}
	
	
	
	
}
