package com.newtours.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.newtours.pageobjects.newToursHomePagePF;
import com.newtours.pageobjects.userRegisterPagePF;

public class newToursCommonPF {
	
	WebDriver driver;
	
	@Test(enabled = true)
	public void login(){
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		newToursHomePagePF nth = new newToursHomePagePF(driver);
		nth.userName().sendKeys("guest");
		nth.password().sendKeys("guest");
		nth.login().click();
	}
	
	public void logout(){
		System.out.println("Log out");
		
	}//end of log out
	@Test(enabled = false)
	public void registerUser(){
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		newToursHomePagePF nth = new newToursHomePagePF(driver);
		nth.registerLink().click();
		userRegisterPagePF urp = new userRegisterPagePF(driver);
		urp.firstName().sendKeys("Mahbub");
		urp.lastName().sendKeys("Siddique");
			
	}//end of register user

}
