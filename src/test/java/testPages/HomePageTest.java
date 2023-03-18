package testPages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BaseUtil.BaseClass;

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
	@Test(enabled = true)
	public void role1_use_of_cssSelector_as_locator_in_logo () {
		driver.findElement(By.cssSelector("em.cms-icon.cms-sprite-loggedout.ms-3")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
