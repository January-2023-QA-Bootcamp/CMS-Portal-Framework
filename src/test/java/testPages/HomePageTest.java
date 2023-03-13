package testPages;

import org.testng.annotations.Test;

import BaseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test
	public void clickLoginButtonTest() throws InterruptedException {
		homePage.clickLoginButton();
	}

}
