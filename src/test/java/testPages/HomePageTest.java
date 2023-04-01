package testPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	// The test executed based on alphabetical order, if no priority given
	// enabled = true means The test case is not disable
	// enabled = false means The test case is disable
	// priority = 1 means, this test case will run first, 2 means second ....
	@Test (enabled = false, priority = 2)
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton(); //
	}
	
	@Test (enabled = false, priority = 1)
	public void clickUserIdTest () {
		homePage.clickUserId();
	}
	
	@Test (enabled = false)
	public void clickPasswordTest () throws InterruptedException {
		homePage.clickPassword();
	}
	
	@Test (enabled = false)
	public void clickNewUserRegistrationTest() throws InterruptedException {
		homePage.clickNewUserRegistration();
	}
	
	// If your Internet is slow, you can see the action of the pageLoadTimeout(), 
	// you can see it is taking 20 seconds to load the page
	// and then it shows the error
	
	// Test for implicit wait and it shows No such element exception
	@Test (enabled = false)
	public void clickIncorrectNewUserRegistrationTest() throws InterruptedException {
		homePage.clickIncorrectNewUserRegistration();
	}
	
	// This test case will fail, when you remove Pagefactory class from code form HomePage to test this
	// When PageFactory class is absent, you will find NullPointerException
	@Test (enabled = false)
	public void nullPointerExceptionTest() throws InterruptedException {
		homePage.clickNewUserRegistration();
	}
	
	@Test (enabled = false)
	public void forgotUserIdTest () {
		homePage.forgotUserIdClick();
	}
	
	@Test (enabled = false)
	public void inputTextInUserIdFieldTest () {
		homePage.inputTextInUserIdField();
	}
	
	@Test(enabled = false)
	public void inputTextInUserIdAndPasswordFieldThenClickLoginButtonTest () throws InterruptedException {
		homePage.inputTextInUserIdAndPasswordFieldThenClickLoginButton();
	}
	
	@Test (enabled = false)
	public void clickUnlockTest() {
		homePage.clickUnlock();
	}
	// Important: Use of xpath as locator
	// Web Element: New User Registration Button
	// We can use an webelement directly in the test class, that is also common, but different people like different way
	@Test(enabled = false)
	public void use_of_xpath_as_locator_in_new_user_registration_button() throws InterruptedException {
		driver.findElement(By.xpath("//a[@id='cms-newuser-reg' or @class='cms-newuser-reg']")).click();
		Thread.sleep(4000);
	}
	
	// This is best scripted in ebay (I will show it later)
	// Important: Use of linkText as locator
	// Web Element: forgot User Id
	@Test(enabled = false)
	public void use_of_linkText_as_locator_in_forgot_user_id_hyperlink() {
		driver.findElement(By.linkText("User ID")).click();
	}
	
	// Important: Use of partialLinkText as locator
	// Web Element: forgot Password
	@Test(enabled = false)
	public void use_of_partialLinkText_as_locator_in_forgot_password_hyperlink() {
		driver.findElement(By.partialLinkText("Passwor")).click();
	}
	
	// Compound class names not permitted, so if even you see class value unique but separated by space, avoid this as class name
	// it will show error and failed
	@Test(enabled = false)
	public void why_we_use_cssSelector_as_locator_in_logo () {
		driver.findElement(By.className("cms-icon cms-sprite-loggedout ms-3")).click();
	}
	
	// Web Element: New User Registration Button
	// Important: Use of cssSelector as locator
	// cssSelector is very important for interview
	// cssSelector by class --> inside the string, first put html tag, then dot, then write value of the class attribute 
	@Test(enabled = false)
	public void role1_use_of_cssSelector_as_locator_in_new_user_registration_button () {
		driver.findElement(By.cssSelector("a.cms-newuser-reg")).click();
	}
	
	// Web Element: logo
	// Important: Use of cssSelector as locator
	// if the class (compund class) contain separate words [gh-tb ui-autocomplete-input], they are actually different class, then
	// we have to close the gap between classes by putting dot/period between them
	// cssSelector by class --> htmltag.class name value 
	// remove the space between words in class value, and replace with dot or period
	@Test(enabled = false)
	public void role2_use_of_cssSelector_as_locator_in_logo () {
		driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.ms-3")).click();
	}
	
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// if you wanna create cssSelector by id 
	// first html tag, then # (hash), then write the value of id attribute inside the string
	@Test(enabled = false)
	public void role3_use_of_cssSelector_as_locator_in_login_button() {
		driver.findElement(By.cssSelector("button#cms-login-submit")).click();
	}

	// Above 3 is mostly used 90% cases of css selector
	// below 3 high level, no need to see if you feel they are tough
	
	// Use of cssSelector as locator
	// Web Element: login Button
	// high level, you can ignore
	// cssSelector by another attribute
	// --> htmltag[any attribute name ='value'] , in xpath - you use // and @, which is absent here 
	// and you can use any other attribute name except id and class
	@Test(enabled = false)
	public void role4_use_of_cssSelector_as_locator_in_login_button () {
		driver.findElement(By.cssSelector("button[name='Submit Login']")).click();
	}
	
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag.value of class[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void role5_use_of_cssSelector_as_locator_in_login_button() {
		driver.findElement(By.cssSelector("button.cms-green-button-reg[name='Submit Login']")).click();
	}
	
	// Important: Use of cssSelector as locator
	// Web Element: login Button
	// Not important, can ignore
	// cssSelector by another attribute
	// --> htmltag#value of ID[attribute name='value'] , in xpath you use // and @, which is absent here and you can use attribute except id and class
	@Test(enabled = false)
	public void role6_use_of_cssSelector_as_locator_in_login_button () {
		driver.findElement(By.cssSelector("button#cms-login-submit[name='Submit Login']")).click();
	}
	
	// Important: Use of tagName as locator
	// tag name: we have to go to Amazon and look for table
	
	// Web Element: logo
	// isDisplayed() is an alternate of click() method which is boolean type
	// isDisplayed() is the method used to verify the presence of a web element within the web page.
	// Use of isDisplayed() available- image, link, button, text field, check box etc.
   @Test(enabled = false)
	public void use_of_isDisplayed_in_logo_image() {
	   boolean elementDisplayed = driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.ms-3")).isDisplayed();
	   System.out.println("Is the LOGO displayed? Ans: " + elementDisplayed);
   }
   
   // Web Element: login Button
	// isEnabled() is the method used to verify if the web element is enabled or
	// disabled within the web page. isEnabled() is primarily used with buttons.
	// Use of isEnabled(), a boolean type method
	
	@Test(enabled = false)
	public void use_of_isEnabled_in_login_button() throws InterruptedException {
		boolean loginButtonEnabled = driver.findElement(By.id("cms-login-submit")).isEnabled();
		System.out.println("Is the Login Button Enable? Ans: " + loginButtonEnabled);
	}
	
	// Web Element: New User Registration
	// no need next time
	// another example
	@Test(enabled = false)
	public void newUserRegistrationTest() {
		boolean nurButtonEnabled = driver.findElement(By.xpath("//a[text()='New User Registration']")).isEnabled();
		System.out.println("Is the New User Registration Button Enable? Ans: " + nurButtonEnabled);
	}
		
    // Both is not working
	// Web Element: check box
	@Test (enabled = false)
	public void use_of_isSelected_in_check_box () {
		boolean checkBoxSelected = driver.findElement(By.xpath("//label[@id='cms-label-tc']")).isSelected();
		System.out.println("Is the check Box selected? Ans: " + checkBoxSelected);
	}
	
	// Web Element: Radio button in Forgot User ID 
	@Test (enabled = false)
	public void use_of_isSelected_in_radio_button () throws InterruptedException {
		// first click on Forgot User ID
		homePage.forgotUserIdClick();
		Thread.sleep(5000);
		boolean radioButtonSelected = driver.findElement(By.xpath("(//label[@class='check-radio'])[1]")).isSelected();
		System.out.println("Is the check Radio Button selected? Ans: " + radioButtonSelected);
	}
	
	// how can you find the title of the page?
	// Basically inside <head> tag, <title> tag is present, you can get it from there or
	// right click on an empty place of any page -- click "view page source" -- ctrl+f (to find) 
	// -- Type 'title' -- find the <title> tag
	@Test(enabled = false)
	public void use_of_getTitle_method_in_home_page() {
		System.out.println("The Title of the Page is: " + driver.getTitle());
	}
	
	// We use New User Registration	
	@Test(enabled = false)
	public void use_of_getCurrentURL_method () throws InterruptedException {
		driver.findElement(By.className("cms-newuser-reg")).click();
		Thread.sleep(5000);
		System.out.println("The Title of the Page is: " + driver.getTitle());
		System.out.println("The current URL is: " + driver.getCurrentUrl());
	}
	
	// We use New User Registration web element to see the text of the web element
	@Test(enabled = false)
	public void use_of_getText_method () {
		WebElement nur = driver.findElement(By.className("cms-newuser-reg"));
		System.out.println("The Text for the Web Element is: " + nur.getText());
	}
	
	// In User id text field, no text is present, let's see what it shows as text? -- Empty
	@Test(enabled = false)
	public void use_of_getText_method_in_userid_field () {
		WebElement userId = driver.findElement(By.name("user-d"));
		System.out.println("The Text for the Web Element is: " + userId.getText());
	}
	
	// We use User ID field
	// getAttribute() actually give the value of the Attribute
	@Test(enabled = false)
	public void use_of_getAttribute_method () throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).click();
		Thread.sleep(4000);
		String value01 = driver.findElement(By.xpath("//input[@id='cms-login-userId']")).getAttribute("placeholder");
		String value02 = driver.findElement(By.xpath("//input[@id='cms-login-userId']")).getAttribute("class");
		String value03 = driver.findElement(By.xpath("//input[@id='cms-login-userId']")).getAttribute("id");
		String value04 = driver.findElement(By.xpath("//input[@id='cms-login-userId']")).getAttribute("title");
		System.out.println("The value of the placeholder attribute is: " + value01);
		System.out.println("The value of the class attribute is: " + value02);
		System.out.println("The value of the id attribute is: " + value03);
		System.out.println("The value of the title attribute is: " + value04);
	}
	
	// We use User ID field
	// getAttribute() actually give the value of the Attribute
	@Test(enabled = false)
	public void use_of_getAttribute_method_02 () throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).click();
		// Where you wanna click Next
		driver.findElement(By.xpath("//input[@id='cms-login-password']")).click();
		Thread.sleep(4000);
		String value01 = driver.findElement(By.xpath("//input[@id='cms-login-userId']")).getAttribute("placeholder");
		System.out.println("The value of the placeholder attribute is: " + value01);
	}
	
	// Using User Id field
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_clear() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("Enthrall IT");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).clear();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("enthrall_12");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).clear();
		Thread.sleep(4000);		
	}
	
	// Click on forgot password field, then send a value inside "Enter user id" field and click by Enter key
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_by_enter_key_of_laptop () throws InterruptedException {
		driver.findElement(By.id("cms-forgot-password")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cms-forgotpwd-userId")).sendKeys("enthrall_12", Keys.ENTER);
		Thread.sleep(4000);
	}
	
	// Click on forgot password field, then send a value inside "Enter user id" field and click by Return key
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click_by_return_key_of_laptop () throws InterruptedException {
		driver.findElement(By.id("cms-forgot-password")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("cms-forgotpwd-userId")).sendKeys("enthrall_12", Keys.RETURN);
		Thread.sleep(4000);
	}
	
	// Interview Question
	@Test(enabled = false)
	public void use_of_navigate_method () throws InterruptedException {
		Thread.sleep(5000);
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
	}
	
	// Very important interview question
	// How can you reset a window size? or they can ask how you can change the screen size by selenium
	
	@Test(enabled = false)
	public void use_of_set_a_specific_size_for_window() throws InterruptedException {
		Thread.sleep(4000);
		// Will get the size of cms window
		// System.out.println("The size of the maximize screen is: "+ driver.manage().window().getSize());
		dimension = new org.openqa.selenium.Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		Thread.sleep(4000);
		System.out.println("The size of the set screen is: " + driver.manage().window().getSize());
		// Extra related to this method
		Thread.sleep(4000);
		driver.navigate().to("https://www.cvs.com");
		Thread.sleep(4000);
		System.out.println("The size of the set screen is: "+ driver.manage().window().getSize());
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println("The size of the maximize screen is: "+ driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.manage().window().setSize(dimension); // just to show again the set size
		Thread.sleep(5000);
		System.out.println("The size of the set screen is: "+ driver.manage().window().getSize());
		Thread.sleep(5000);
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		System.out.println("The size of the full screen is: "+ driver.manage().window().getSize());	
	}
	
	// not important at all
	@SuppressWarnings("deprecation")
	@Test(enabled = false)
	public void use_of_set_script_timeout_for_window() {
        driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15));
        // setScriptTimeout () method deprecated, so giving you warning, this method is going to be out from selenium
        // you use @SuppressWarnings("deprecation")
		driver.get("https://www.ebay.com");		
	}
	
	@Test (enabled = false)
	public void logoDisplayedTest01 () {
		homePage.logoDisplayed (); // Actual Result
		Assert.assertTrue(true); // Expected Result
	}
	
	@Test (enabled = false)
	public void logoDisplayedTest02 () {
		homePage.logoDisplayed (); // Actual Result or outcome which doesn't match with your below expectation
		Assert.assertTrue(false); // Expected Result // java.lang.AssertionError: expected [true] but found [false]
		// Although the outcome is true, but because of difference between expected vs actual is not same, the test case failed
	}
	
	@Test (enabled = false)
	public void logoDisplayedTest03 () {
		homePage.logoDisplayed(); // Actual Result : true
		Assert.assertFalse(false, "Application Logo is not Displayed ..... ..... "); // false false means true
		//Assert.assertTrue(true, "Application Logo is not Displayed ..... ..... ");  // Expected Result with error message if failed
	}
	
	@Test (enabled = false)
	public void logoDisplayedTest04 () {
		homePage.logoDisplayed(); // Actual Result : true
		Assert.assertFalse(true, "Application Logo is not Displayed ..... ..... ");
		// java.lang.AssertionError: Application Logo is not Displayed ..... .....  expected [false] but found [true]
		// error message will be appeared when the assertion failed 
	}
	
	// A regular title test
	@Test(enabled = false)
	public void use_of_getTitle_method01() throws InterruptedException {
		String actual = driver.getTitle();
		Thread.sleep(5000);	
		System.out.println("The title of the Page is: " + actual);
	}
	
	// Will Pass
	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion01() throws InterruptedException {
		// Your expected Title
		String expected = "CMS Enterprise Portal";
		String actual = driver.getTitle();
		System.out.println("The Title of the home Page is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match");
		// Hard Assertion will not go to next line of failed, but move to next line when passed
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);
	}
	
	// Will Fail
	@Test(enabled = false)
	public void use_of_getTitle_method_with_assertion02() throws InterruptedException {
		// Your expected Title
		String expected = "CMS Enterprise Portal           ";
		String actual = driver.getTitle();
		System.out.println("The Title of the home Page is: " + actual);
		Assert.assertEquals(actual, expected, "Home Page Title doesn't match ....... ");  // Hard Assertion, execution stopped here if Assertion fail
		// java.lang.AssertionError: Home Page Title doesn't match .......  expected [CMS Enterprise Portal           ] but found [CMS Enterprise Portal]
		// Hard Assertion will not go to next line of failed, but move to next line when passed
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);
	}
	
	// Will Pass
	@Test(enabled = false)
	public void use_of_getTitle_method_with_soft_assertion() throws InterruptedException {
		// Your expected Title
		String expected = "CMS Enterprise Portal           ";
		String actual = driver.getTitle();
		System.out.println("The Title of the home Page is: " + actual);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actual, expected, "Home Page Title doesn't match ....... ");
		// Soft Assertion, execution will not stopped here if Assertion is failed
		String currentURL = driver.getCurrentUrl();
		System.out.println("The current url is: " + currentURL);
	}
	
	// Very very important for use in framework and also a interview question
	// similar like above, nothing different, extra example
	@Test(enabled = false)
	public void use_of_mouse_hoverAction_on_ourLocations () throws InterruptedException {
		Thread.sleep(5000);	
		driver.navigate().to("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
		// Actions actions = new Actions(driver); // it is defined in Base class
		Thread.sleep(2000);
		actions.moveToElement(ourLocations).build().perform(); // actions object is coming form Base class
		Thread.sleep(6000);		
		System.out.println("\nThe text of this web element is: "+ ourLocations.getText());

	}
	
	// Regular click method
	@Test(enabled = false)
	public void use_of_click_method_in_loginButtonTest () throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).click();
		Thread.sleep(3000);
	}
	
	// interview question: what are the alternative of click()
	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest01() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest02() throws InterruptedException {
		driver.findElement(By.id("cms-login-submit")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
	}
	
	// important
	// alternate of click()
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest03() throws InterruptedException {
		WebElement loginButton = driver.findElement(By.id("cms-login-submit"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginButton); // arguments[0] means, find the web element of index 0, first occurrence
		Thread.sleep(4000);
	}
	
	// alternate of click()
	// "arguments[0].click()" --- easy to memorize, memorize it, if you want
	// follow the above one, because you can use any kind of locator 
	// (specially xpath is difficult to create by below one)
	// Que: what is the alternative of click() method or click an web element 
	// or how to find a hidden web element-- very important interview question 
	// don't follow this one, but if you ever see it, i hope you can recognize it
	@Test(enabled = false)
	public void alternate_of_click_method_in_loginButtonTest04() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('cms-login-submit').click();");
		Thread.sleep(4000);
	}
	
	// From here till line 540, this is high level, so just see, don't take them seriously
	// alternative to click an web element in many ways (never memorize, a collection of code)
	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest06() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.click(homepageLoginButton).perform();
	}
	
	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest07() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.moveToElement(homepageLoginButton).click().perform();
	}

	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest08() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.clickAndHold(homepageLoginButton).release().perform();
	}

	// Not important
	// alternate of click()
	@Test(enabled = false)
	public void homepageLoginButtonTest09() {
		WebElement homepageLoginButton = driver.findElement(By.xpath("//button[@id='cms-login-submit']"));
		actions.sendKeys(homepageLoginButton, Keys.RETURN).perform();
	}
	
	@Test (enabled = false)
	public void loggerPositiveTest () throws InterruptedException {
		homePage.loggerPositiveMethod();
	}
	
	@Test (enabled = false)
	public void loggerNegativeTest () throws InterruptedException {
		homePage.loggerNegativeMethod();
	}
	
	// login process regular to compare with line 565
	@Test(enabled = false)
	public void use_of_sendKeys_method_then_click() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='cms-login-userId']")).sendKeys("January 2023");
		Thread.sleep(4000);
		driver.findElement(By.name("pass-d")).sendKeys("Enthrall@12345");
		Thread.sleep(4000);
		driver.findElement(By.name("Submit Login")).click();
		Thread.sleep(4000);		
	}
	
	// login process by JavascriptExecutor
	@Test(enabled = false)
	public void use_of_sendKeys_method_by_javascriptExecutor_then_click() throws InterruptedException {
		WebElement userId = driver.findElement(By.xpath("//input[@id='cms-login-userId']"));
		WebElement password = driver.findElement(By.name("pass-d"));
		WebElement loginButton = driver.findElement(By.name("Submit Login"));
		// JavascriptExecutor js = (JavascriptExecutor) driver; // we instantiated in Base class
		js.executeScript("arguments[0].value='January 2023' ", userId); // how to send text inside a field by JavascriptExecutor
		Thread.sleep(4000);
		js.executeScript("arguments[0].value='Enthrall@12345' ", password);
		Thread.sleep(4000);
		js.executeScript("arguments[0].click()", loginButton); 
		Thread.sleep(4000);
	}

	// it will fail
	@Test(enabled = false)
	public void how_to_handle_hidden_element_by_regular_selenium_method() throws InterruptedException {
		Thread.sleep(5000);	
		// driver.navigate().to("https://courses.letskodeit.com"); // window handles need to be used
		driver.navigate().to("https://enthrallit.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on Selenium from Header
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		Thread.sleep(4000);
		// identify the 'Hide' element and click on it
		// The search field will be disappeared, but we can pass value on it, as we get info before
		driver.findElement(By.xpath("//button[@id='formButton3']")).click();
		// identify element and set/input text or value (line 597)
		// it will fail by below error message
		// org.openqa.selenium.ElementNotInteractableException: element not interactable
		// whenever you find element not interactable in console, that is for sure a hidden element
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-control']//parent::form[@id='form3']")).sendKeys("January 2023");

	}
	
	@Test(enabled = false)
	public void how_to_handle_hidden_element_by_javascriptExecutor() throws InterruptedException {
		Thread.sleep(5000);	
		// driver.navigate().to("https://courses.letskodeit.com"); // window handles need to be used
		driver.navigate().to("https://enthrallit.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Click on Selenium from Header
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Selenium']")).click();
		Thread.sleep(4000);
		// identify the 'Hide' element and click on it
		// The search field will be disappeared, but we can pass value on it, as we get info before
		// You can't see 615 is clicked, we need scrolling.
		driver.findElement(By.xpath("//button[@id='formButton3']")).click();
		// identify element and set/input text or value by JavascriptExecutor
		WebElement serchField = driver.findElement(By.xpath("//input[@class='form-control']//parent::form[@id='form3']"));
		js.executeScript("arguments[0].value='January 2023' ", serchField);
		
		// not important
		// Extra code
		// Extra not related to hidden elements and not important
		// How to get title of the page by JavaScript
		// How to read a JavaScript variable in Selenium WebDriver?
		// alternate of getTitle()
		String title = (String) js.executeScript("return document.title");
		System.out.println("Title of the webpage :" + title);
	}
	
	// very very important
	// "request An Appointment" web element
	// using visibilityOfElementLocated() method
	// This is a very common scenario in industry to use explicitly wait
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai01() throws InterruptedException {
		Thread.sleep(5000);	
		driver.navigate().to("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Request an Appointment element
		// We learn line 644 here
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
		// the below line is not part of testing, finding doctor name by putting a name in the field
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(4000);
	}
	
	// very very important
	// "request An Appointment" web element
	// using elementToBeClickable() method
	// This is a very common scenario in industry
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai02() throws InterruptedException {
		Thread.sleep(5000);	
		driver.navigate().to("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
		// the below line is not part of testing
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(4000);
	}
	
	// important
	// "request An Appointment" web element
	// using visibilityOf() method
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai03() throws InterruptedException {
		Thread.sleep(5000);	
		driver.navigate().to("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement requestAnAppointment = driver.findElement(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"));
		wait.until(ExpectedConditions.visibilityOf(requestAnAppointment)).click();
		// the below line is not part of testing
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(4000);
	}
	
	// not important
	// "request An Appointment" web element
	// using presenceOfElementLocated() method
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai04() throws InterruptedException {
		Thread.sleep(5000);	
		driver.navigate().to("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"))).click();
		// the below line is not part of testing
		driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Andrea Perez", Keys.RETURN);
		Thread.sleep(4000);
	}
	
	
	// not important
	// "request An Appointment" web element
	// using textToBePresentInElement() method, this is not a clickable method, just to recognize the web element
	@Test(enabled = false)
	public void use_of_explicitly_wait_in_MountSinai05() throws InterruptedException {
		Thread.sleep(5000);	
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement raa = driver.findElement(By.xpath("//a[normalize-space(text())='Request an Appointment' and @class='hidden-xs dropdown']"));
		wait.until(ExpectedConditions.textToBePresentInElement(raa, "Request an Appointment"));
		Thread.sleep(4000);
	}

		
}
