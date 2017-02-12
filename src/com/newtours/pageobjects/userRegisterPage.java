package com.newtours.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class userRegisterPage {
	
	WebDriver driver;
	
	public userRegisterPage(WebDriver driver){
		
		this.driver = driver;
		
	}//end of constructor
		
	By firstName = By.name("firstName");
	By lastName = By.name("lastName");
	
	public WebElement firstName(){
		return driver.findElement(firstName);
	}
	
	public WebElement lastName(){
		return driver.findElement(lastName);
	}
}
