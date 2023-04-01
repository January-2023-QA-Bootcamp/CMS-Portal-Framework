package testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import static common.CommonActions.*;

public class ForgotUserIdTest extends BaseClass {

	// drop down, all categories
	// drop down is a commonly asked interview question
	// here - using selectByIndex() method
	// This method is not suggested, or not used much
	// Because, adding a new web element or deleting a new one change the index number
	@Test(enabled = false)
	public void use_of_dropdown_selectByIndex_method() throws InterruptedException {
		forgotUserId.forgotUserIdClick();
		Thread.sleep(5000);
		System.out.println("The current url is: " + driver.getCurrentUrl());
		WebElement birthDate = driver.findElement(By.xpath("//select[@name='cms-forgotid-birthDate']"));
		select = new Select(birthDate);
		select.selectByIndex(15); // Index type
		Thread.sleep(5000);
	}

	// drop down, all categories
	// drop down is a commonly asked interview question
	// Most commonly use method in drop down --> selectByVisibleText()
	@Test(enabled = false)
	public void use_of_dropdown_selectByVisisbleText_method() throws InterruptedException {
		forgotUserId.forgotUserIdClick();
		Thread.sleep(5000);
		System.out.println("The current url is: " + driver.getCurrentUrl());
		WebElement birthMonth = driver.findElement(By.xpath("//select[@id='cms-forgotid-birthMonth']"));
		select = new Select(birthMonth);
		select.selectByVisibleText("March"); // Text type
		Thread.sleep(5000);
	}

	// drop down, all categories
	// drop down is a commonly asked interview question
	// use method --> selectByValue()
	@Test(enabled = false)
	public void use_of_dropdown_selectByValue_method() throws InterruptedException {
		forgotUserId.forgotUserIdClick();
		Thread.sleep(5000);
		System.out.println("The current url is: " + driver.getCurrentUrl());
		WebElement birthYear = driver.findElement(By.xpath("//select[@id='cms-forgotid-birthYear']"));
		select = new Select(birthYear);
		select.selectByValue("2003"); // String type value attribute
		Thread.sleep(5000);
	}

}
