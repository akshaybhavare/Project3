package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@type='text']")
	private WebElement emailid;
	@FindBy(how=How.XPATH,using="//input[@type='password']")
	private WebElement passwored;
	
	public LogInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPasswored() {
		return passwored;
	}

}
