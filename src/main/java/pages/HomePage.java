package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

// new, you have to manually write it to get access
// this is possible when they are static in nature, * means all
import static common.CommonActions.*;

public class HomePage {
	public WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		// PageFactory help to instantiate WebElements
		PageFactory.initElements(driver, this);
	}
	
	// 1st way: Most common way to write the WebElement (@FindBy), you must know how to do that
	// Use of 'Id' attribute as locator
	@FindBy (id = "cms-login-submit")
	WebElement loginButton;
	
	// Use of 'name' attribute as locator
	@FindBy (name = "user-d")
	WebElement userId;
	
	// 2nd way to write the WebElement: not common, here I used for password
	// Use of 'name' attribute as locator
	@FindBy(how = How.NAME, using = "pass-d")
	WebElement password;
	
	// Use of 'class' attribute as locator
	@FindBy (className = "cms-newuser-reg")
	WebElement newUserRegistration;
	
	@FindBy (className = "cms-newuser-registration")
	WebElement IncorrectNewUserRegistration;
	
	@FindBy (xpath = "//a[text()='User ID']")
	WebElement forgotUserId;
	
	// 3rd way to write the WebElement: not common, here I used unlock web element
	// instead of xpath, we can use id, name, class etc as locator.
	By unlock = By.xpath("//a[contains(text(), 'unl')]");
	// Please see line 102 for clickUnlock() method
	
	@FindBy (xpath = "//em[@id='cms-homepage-header-logo-unauth' and @class='cms-icon cms-sprite-loggedout ms-3']")
	WebElement logo;
	
	@FindBy (xpath = "//em[@id='cms-homepage-header' and @class='cms-icon']")
	WebElement IncorrectLogo;
	
	// for logger test
	@FindBy (name = "user-d-wrong")
	WebElement wrongUserId;

	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(5000);
	}
	
	public void clickUserId() {
		userId.click();
	}
	
	public void clickPassword() throws InterruptedException {
		password.click();
		Thread.sleep(5000);
	}
	
	public void clickNewUserRegistration () throws InterruptedException {
		newUserRegistration.click();
		Thread.sleep(3000);
	}
	
	public void clickIncorrectNewUserRegistration () throws InterruptedException {
		IncorrectNewUserRegistration.click();
		Thread.sleep(3000);
	}
	
	public void forgotUserIdClick() {
		clickElement(forgotUserId);
	}
	
	// We are using sendKeys() to input text
	public void inputTextInUserIdField () {
		// as we used Thread.sleep either we can use throws or we can use try catch block
		// we used try catch block here, No relation of try catch with sendKeys() method
		try {
			// userId webElement is created and used before in line 28
			userId.sendKeys("enthrall_12");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void inputTextInUserIdAndPasswordFieldThenClickLoginButton () throws InterruptedException {
		inputText(userId, "January 2023");
		Thread.sleep(3000);
		inputText(password, "Enthrall@1234");
		Thread.sleep(3000);
		clickElement(loginButton);
		Thread.sleep(6000);
	}
	
	public void clickUnlock() {
		// new
		driver.findElement(unlock).click();
	}
	
	public boolean logoDisplayed () {
		boolean flag = logo.isDisplayed();
		System.out.println("Is the Logo displayed? Ans: " + flag);
		return flag;
	}
	
	public boolean logoDisplayedIncorrect () {
		boolean flag = IncorrectLogo.isDisplayed();
		System.out.println("Is the Logo displayed? Ans: " + flag);
		return flag;
	}
	
	// To test logger if web element is correct
	public void loggerPositiveMethod () throws InterruptedException {
		inputText(userId, "January 2023");
		Thread.sleep(3000);
		inputText(password, "Enthrall@1234");
		Thread.sleep(3000);
		clickElement(loginButton);
		Thread.sleep(6000);
	}
	
	// To test logger if web element is not correct
	public void loggerNegativeMethod () throws InterruptedException {
		inputText(wrongUserId, "January 2023");
		Thread.sleep(3000);
		inputText(password, "Enthrall@1234");
		Thread.sleep(3000);
		clickElement(loginButton);
		Thread.sleep(6000);
	}
	
	

}
