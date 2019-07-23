package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.BaseClass;
import com.utilities.CommonMethods;
import com.xpaths.Xpaths;

public class loginPage extends BaseClass {

	@BeforeClass
	public void lunchBrowser() {
		BaseClass.setUp();
	}
	
	@Test
	public void login() {
		try {
			Thread.sleep(1000);
			WebElement userName = driver.findElement(By.xpath(Xpaths.userName));
			CommonMethods.enterValue(userName, "Admin");
			Thread.sleep(1000);
			WebElement password = driver.findElement(By.xpath(Xpaths.password));
			CommonMethods.enterValue(password, "admin123");
			Thread.sleep(1000);
			CommonMethods.click(driver.findElement(By.xpath(Xpaths.loginButton)));
		} catch (InterruptedException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
	
	@AfterClass
	public void closeBrowser() {
		BaseClass.tearDown();
	}
}
