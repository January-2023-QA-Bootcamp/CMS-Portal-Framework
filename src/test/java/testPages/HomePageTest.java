package testPages;

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
	
	@Test (enabled = true)
	public void clickNewUserRegistrationTest() throws InterruptedException {
		homePage.clickNewUserRegistration();
	}

}
