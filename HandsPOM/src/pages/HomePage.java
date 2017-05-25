package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HomePage {
	
	public WebDriver driver;
	public String driverPath = "C:/Users/ashfa/Documents/Selenium Stuffs/Drivers/";
	
	/*public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}*/
	
	public WebDriver Home_Page(WebDriver driver, String browser) {

		this.driver = driver;
		System.out.println("The browser is " + browser);

		if (browser.equalsIgnoreCase("ie")) {
			System.out.println("*******************");
			System.out.println("launching IE browser");
			System.setProperty("webdriver.ie.driver", driverPath + "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();	
			
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("*******************");
			System.out.println("launching Firefox browser");
			System.setProperty("webdriver.geckodriver.driver", driverPath + "geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		} else if (browser.equalsIgnoreCase("chrome")) {

			System.out.println("*******************");
			System.out.println("launching Chrome browser");
			System.setProperty("webdriver.gecko.driver", driverPath + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		} else {
			System.out.println("Invalid Browser Type");
		}
		return driver;
	}
/*	public WebDriver getDriver() {
		return driver;
	}*/
	
	
}
