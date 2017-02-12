package com.newtours.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.newtours.pageobjects.newToursHomePage;
import com.newtours.pageobjects.userRegisterPage;

public class newToursCommon {
	
	WebDriver driver = null;
	
	@Test(enabled = true)
	public void login(){
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		newToursHomePage nth = new newToursHomePage(driver);
		nth.userName().sendKeys("guest");
		nth.password().sendKeys("guest");
		nth.login().click();
	}
	
	public void logout(){
		System.out.println("Log out");
		
	}//end of log out
	@Test (enabled = false)
	public void registerUser(){
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		newToursHomePage nth = new newToursHomePage(driver);
		nth.registerLink().click();
		userRegisterPage urp = new userRegisterPage(driver);
		urp.firstName().sendKeys("Mahbub");
		urp.lastName().sendKeys("Siddique");
			
	}//end of register user

}
