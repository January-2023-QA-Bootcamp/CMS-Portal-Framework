package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class ForgotUserIdTest extends BaseClass {
	@Test(enabled = true)
	public void use_of_dropdown_selectByIndex_method () throws InterruptedException {
		homePage.forgotUserIdClick();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		WebElement dropElement1 = driver.findElement(By.xpath("//select[@id='cms-forgotid-birthMonth']"));
		Select select = new Select(dropElement1);
		select.selectByIndex(3);
		Thread.sleep(5000);
	}

}
