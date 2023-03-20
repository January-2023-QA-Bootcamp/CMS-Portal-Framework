package BaseUtil;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
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
		
		/*
		// 2nd way, to show the location of the chrome driver
		// This is a dynamic path (relative path)
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/chromedriver.exe");
		*/
		
		// New
		// 3rd and final way, to show the location of chrome driver
		// This is a dynamic path (relative path)
		// I will use this one till end of the course
		/*
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		*/
		
		// When none of the browser working, then you can use webdrivermanager
		// webdriver manager doesn't need any physical driver
		// From below line, the most updated version is used, when no version is mentioned	
		/*
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		*/
		
		// 111.0.5563.64  --- current version
		// 110.0.5481.77  --- older version
		// 109.0.5414.74  --- older version
		// older version sometimes used for stability of browser, sometime for the request of Authority
		// if you choose version, then it will use that specific version of driver
		/*
		WebDriverManager.chromedriver().driverVersion("110.0.5481.77").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		*/
		
		// WebDriverManager is used for most updated firefoxdriver()
		// WebDriverManager.firefoxdriver().setup();
		// driver = new FirefoxDriver();
		
		// WebDriverManager is used for most updated edgedriver()
		// WebDriverManager.edgedriver().setup();
		// driver = new EdgeDriver();
		
		// In the industry: Chrome driver is used 90% time
		// and the best practice to show location: ./driver/chromedriver.exe
		System.setProperty("webdriver.chrome.driver",  "./driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
		// We can also use fullscreen() instead of maximize()
		// driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
		
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
	
	

}
