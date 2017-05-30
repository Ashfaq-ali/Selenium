package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

public class NoPOM {

	WebDriver driver;
	public static String driverPath = "C:/Users/ashfa/Documents/Selenium Stuffs/Drivers/";
	
	@BeforeTest
	public void LaunchBrower(){
		System.out.println("launching IE browser");
		System.setProperty("webdriver.ie.driver", driverPath + "IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
}
