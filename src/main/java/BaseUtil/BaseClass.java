package baseUtil;

import java.time.Duration;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ForgotUserId;
import pages.HomePage;
import utils.Configuration;
import static utils.IConstant.*;

public class BaseClass {
	public WebDriver driver;
	public HomePage homePage; // or we can use protected type, otherwise it is default type
	Configuration config;
	protected Dimension dimension;
	protected Actions actions;
	public ForgotUserId forgotUserId;
	protected Select select;
	
	@BeforeMethod
	public void setUp() {
		config = new Configuration();	
		initDriver(); // From line 40
		actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(config.getProperties(URL));
		long pageLoadTime = Long.parseLong(config.getProperties(PAGELOAD_WAIT));
		long implicitlyWait =	Long.parseLong(config.getProperties(IMPLICITLY_WAIT));
		long explicitlyWait =	Long.parseLong(config.getProperties(EXPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));
		initClasses(); // From line 71
	}
	
	private void initDriver () {
		String browserName = config.getProperties(BROWSER);
		
		switch (browserName) {
		case "CHROME":
			System.setProperty("webdriver.chrome.driver",  "./driver/chromedriver.exe");
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(cOptions);
			break;
		
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver",  "./driver/geckodriver.exe");
			FirefoxOptions fOptions = new FirefoxOptions();
			fOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver(fOptions);
			break;
			
		case "EDGE":
			System.setProperty("webdriver.edge.driver",  "./driver/msedgedriver.exe");
			driver = new EdgeDriver();
			
		default:
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
		
	}
	
	private void initClasses() {
		homePage = new HomePage(driver);
		forgotUserId = new ForgotUserId(driver);
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}
	
	
	
	
	

}
