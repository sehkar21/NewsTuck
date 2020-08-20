package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

WebDriver ldriver;

public Homepage(WebDriver rdriver) {
	ldriver = rdriver;
	PageFactory.initElements(rdriver, this);
}


@FindBy(tagName="a")  
@CacheLookup
List<WebElement> NewsLink;

public List<WebElement> NewsLink() {
	return NewsLink;
}

@FindBy(xpath="//div[@class='dateTimeFilterButton filter-box-active']")  
@CacheLookup
WebElement currentdate;

public WebElement currentdate() {
	return currentdate;
}


@FindBy(xpath="//li[contains(text(),'Last 3 days')]")  
@CacheLookup
WebElement Last3days;

public WebElement Last3days() {
	return Last3days;
}

@FindBy(xpath="//body//div//div[1]//div[1]//div[2]//ul[1]//li[1]//app-select[1]//div[1]//div[1]")  
@CacheLookup
WebElement CompetencyRank;

public WebElement CompetencyRank() {
	return CompetencyRank;
}

@FindBy(xpath="//div[@class='select-wrap']//li[contains(text(),'3')]")  
@CacheLookup
WebElement CompetencyRating;

public WebElement CompetencyRating() {
	return CompetencyRating;
}


@FindBy(xpath="//body//div//div[1]//div[1]//div[2]//ul[1]//li[2]//app-select[1]//div[1]//div[1]")  
@CacheLookup
WebElement TrustWorthinessRank;

public WebElement TrustWorthinessRank() {
	return TrustWorthinessRank;
}


@FindBy(xpath="//div[@class='select-wrap']//li[contains(text(),'4')]")  
@CacheLookup
WebElement TrustWorthinessRating;

public WebElement TrustWorthinessRating() {
	return TrustWorthinessRating;
}


@FindBy(xpath="//body//div//div[1]//div[1]//div[2]//ul[1]//li[3]//app-select[1]//div[1]//div[1]")  
@CacheLookup
WebElement FactRank;

public WebElement FactRank() {
	return FactRank;
}


@FindBy(xpath="//div[@class='select-wrap']//li[contains(text(),'5')]")  
@CacheLookup
WebElement FactRating;

public WebElement FactRating() {
	return FactRating;
}


@FindBy(xpath="//body//div//div[1]//div[1]//div[2]//ul[1]//li[4]//app-select[1]//div[1]//div[1]")  
@CacheLookup
WebElement OpinionRank;

public WebElement OpinionRank() {
	return OpinionRank;
}


@FindBy(xpath="//div[@class='select-wrap']//li[contains(text(),'2')]")  
@CacheLookup
WebElement OpinionRating;

public WebElement OpinionRating() {
	return OpinionRating;
}

@FindBy(xpath="//input[@id='defaultCheck1']")  
@CacheLookup
WebElement NewsCheckBox;

public WebElement NewsCheckBox() {
	return NewsCheckBox;
}

@FindBy(xpath="//span[@class='slider']")  
@CacheLookup
WebElement EnableSliderbtn;

public WebElement EnableSliderbtn() {
	return EnableSliderbtn;
}

@FindBy(xpath="//a[@class='actionButton']")  
@CacheLookup
WebElement EditorReviewBtn;

public WebElement EditorReviewBtn() {
	return EditorReviewBtn;
}

@FindBy(xpath	="/html[1]/body[1]/ngb-modal-window[1]/div[1]/div[1]/div[1]/div[1]/a[1]")  
@CacheLookup
WebElement BrowseAgain;

public WebElement BrowseAgain() {
	return BrowseAgain;
}

@FindBy(xpath="//li[contains(text(),'Fri Aug 14 2020 11:48:10  |')]")  
@CacheLookup
WebElement TimeofPublication;

public WebElement TimeofPublication() {
	return TimeofPublication;
}

}
