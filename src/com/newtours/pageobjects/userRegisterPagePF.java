package com.newtours.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class userRegisterPagePF {
	
	WebDriver driver;
	
	public userRegisterPagePF(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}//end of constructor
			
	@FindBy(name="firstName")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastName;
	
	public WebElement firstName(){
		return firstName;
	}
	
	public WebElement lastName(){
		return lastName;
	}
}
