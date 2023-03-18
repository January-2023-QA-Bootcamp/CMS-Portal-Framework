package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.HomePage;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage; // or we can use protected type, otherwise it is default type
	
	@BeforeMethod
	public void setUp() {
		/*
		// System is a class and setProperty is a method
		// 1st way, to show the location of chrome driver
		// This is an absolute path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tofael\\eclipse-workspace\\gov.cms.portal.january\\driver\\chromedriver.exe");
		*/
		
		// new
		// 2nd way, to show the location of the chrome driver
		// This is a dynamic way (relative path)
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		// maximize method maximize the window
		// driver.manage().window().maximize();
		// deleteAllCookies do delete the cookies
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
		// We can also use fullscreen() instead of maximize()
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
		
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
	
	

}
