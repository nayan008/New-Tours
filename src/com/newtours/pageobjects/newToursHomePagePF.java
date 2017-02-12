package com.newtours.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class newToursHomePagePF {
	
	WebDriver driver;
	
	public newToursHomePagePF(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}//end of constructor
	
	
	//@FindBy(xpath = "//input[@name='userName']")
	@FindBy(name="userName")
	WebElement edt_userName;
	
	@FindBy(how = How.NAME, using = "password")
	WebElement edt_userPass;
	
	@FindBy(name="login")
	WebElement btn_signIn;
	
	@FindBy(linkText = "REGISTER")
	WebElement lnk_register;
	
	public WebElement registerLink(){
		return lnk_register;
	}
	
	
	public WebElement userName(){
		return edt_userName;
	}//end of userName
	
	public WebElement password(){
		return edt_userPass;
		
	}//end of password
	
	public WebElement login(){
		return btn_signIn;
	}//end of login
	

}//end of class
