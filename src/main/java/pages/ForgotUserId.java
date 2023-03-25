package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;

public class ForgotUserId {
	public WebDriver driver;
	
	public ForgotUserId(WebDriver driver) {
		this.driver = driver;
		// PageFactory help to instantiate WebElements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='cms-forgot-userid']")
	WebElement forgotUserId;
	
	public void forgotUserIdClick() {
		clickElement(forgotUserId);
	}

}
