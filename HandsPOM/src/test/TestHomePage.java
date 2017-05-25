package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import pages.*;

public class TestHomePage {

	WebDriver driver;
	HomePage objHomePage;
	Login objLogin;

	@BeforeTest
	public void launchBrowser() throws InterruptedException {

		objHomePage = new HomePage();
		this.driver = objHomePage.Home_Page(driver, "firefox");
		Thread.sleep(1000);
		driver.navigate().to("http://demo.guru99.com/V4/");
		
		System.out.println(driver.getTitle() + driver.getPageSource());
		//driver.get("http://demo.guru99.com/V4/");
		//String actual_title = driver.findElement(By.className("barone")).getText();
		//System.out.println(actual_title);
		//findElement.By.tagName("title").getText();
		
	   }

	@Test
	public void Test_HomePage() {
		//driver = objHomePage.getDriver();
		//objLogin = new Login(driver);
		//String actual_title = driver.getTitle();
		//String actual_title = objLogin.getPage_title();
		//Assert.assertEquals(actual_title, "Guru99 Bank Home Page");
		// objLogin.getUser_fieldName("test");
	}

}
