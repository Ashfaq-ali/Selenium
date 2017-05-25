package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	//By UserName = By.xpath("//td[contains(@align,'right')]");
	By titleName = By.tagName("title");
	By UserName = By.name("uid");
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getPage_title() {

		//driver.findElement(UserName).sendKeys(StrUserName);
		return driver.findElement(titleName).getText();
		
	}
	
	
	
	//<td align="right">UserID</td>
	//"//i[contains(@class,'Mail')]"
	
}
