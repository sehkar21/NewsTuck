package com.qa.Base;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Parameters;

import com.qa.config.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig config = new ReadConfig();
	public String url = config.url();
	public static WebDriver driver;
	
	public static ThreadLocal<WebDriver> tldriver = new ThreadLocal<WebDriver>();
	
	public static synchronized WebDriver getdriver()
	{
		return tldriver.get();
	}
	
	@Parameters("Browser")
	@BeforeClass
	public WebDriver openbrowser(String Browser) {
		
		if(Browser.equalsIgnoreCase("chrome")) 
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		tldriver.set(driver);
		}
		else if(Browser.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		tldriver.set(driver);
		}
		else if(Browser.equalsIgnoreCase("ie")) 
		{
			WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		tldriver.set(driver);
		}

		return getdriver();
		
	}
	
	public  String getScreenshot() {

		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		File src = ((TakesScreenshot)getdriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + timeStamp+ ".png";
		File dest = new File(path);
		try {
		FileUtils.copyFile(src, dest);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	public String randomstring() {
		String randomstring = RandomStringUtils.randomAlphabetic(9);
		return(randomstring);
	}
	
	public String randomnumber() {
	String randomnumber = RandomStringUtils.randomNumeric(9);
	return(randomnumber);	
}
	
	
 @AfterClass
 public void TearDown() 
	  {
		  driver.close();
		  } 
	 
	
}