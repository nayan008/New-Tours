package com.newtours.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class newToursHomePage {
	
	WebDriver driver;
	
	public newToursHomePage(WebDriver driver){
		this.driver = driver;
			
	}//end of constructor
	
	By edt_userName = By.name("userName");
	By edt_userPass = By.name("password");
	By btn_signIn = By.name("login");
	By lnk_register = By.linkText("REGISTER");
	
	public WebElement registerLink(){
		return driver.findElement(lnk_register);
	}
	
	
	public WebElement userName(){
		return driver.findElement(edt_userName);
	}//end of userName
	
	public WebElement password(){
		return driver.findElement(edt_userPass);
		
	}//end of password
	
	public WebElement login(){
		return driver.findElement(btn_signIn);
	}//end of login
	

}//end of class
